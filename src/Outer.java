public class Outer {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();
    }

    class Inner {

        public void print() {
            System.out.println("Hello");
        }

    }

}
