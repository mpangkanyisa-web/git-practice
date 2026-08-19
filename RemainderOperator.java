public class RemainderOperator {
    public static void main(String[] args) {
        int [] ia = {0, 1, 2, 3};
        int idx = (int)(Math.random() * 101) - 50;
        System.out.println(ia[idx % ia.length]);
    }
}
