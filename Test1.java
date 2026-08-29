public class Test1 {
    static void adder(int x) {
        x += 1;
    }

    public static void main(String[] args) {
        int x = 1;
        adder(x);
        System.out.println(x);
    }
}

