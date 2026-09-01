public class DoStuffMethod {


    interface P { default void doStuff() {}}
    interface Q { void doStuff();} 
    abstract  class A implements  P, Q {
        abstract void doStuff() {}
    }
    abstract  class B implements P, Q {
        public abstract  void  doStuff();

    }
     class C implements P{}
     class D implements P, Q{}
     class E implements P{
        public void doStuff() {
            super.doStuff();
        }
     }


     
}
