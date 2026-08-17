public class ZeroExceptionCheck {
    public static void main(String[] args) {
        int x = 1;
        int z;
        try {
            z = 100 / --x;
        }
        catch(Exception e) {
            System.out.println("bang");
            // e.printStackTrace();
        }    
        System.out.println(x);
    }
}
