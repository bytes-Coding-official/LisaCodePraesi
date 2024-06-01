public class Outer {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner2 inner2 = new Inner2();
        inner.print();
        inner2.print();
    }

    class Inner {

        public void print() {
            System.out.println("Hello");
        }

    }
    static class Inner2 {

        public void print() {
            System.out.println("Hello");
        }

    }
}
