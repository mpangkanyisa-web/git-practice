public class Counter {
    static int value;

    synchronized Counter() {
        value++;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = Counter::new;

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(value);
    }
}
