public class Test {
    public static void main(String[] args) {
        int i = 0;
        String s = "Values: ";
        loop: while (i < 5) { 
            if (i++% 2 ==0) continue loop;
            s.concat(", ")
                .concat(Integer.toString(i));
        }
        System.out.println(s);
    }
}
