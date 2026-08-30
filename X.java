abstract  class Y {
    int x = 100;
    Y(int v) {
        x=v;
        announce();   
    }
    abstract void announce();
}
public class X extends Y {
    int x = 300;
    X() {super(200); }
    void announce() {System.out.println("x is " + x);}
    public static void main(String[] args) {
        new X();
    }
}

