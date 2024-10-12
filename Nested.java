public class Nested {
    public static void main(String[] args) {
        try {
            meth(); // Calls the meth() method
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } finally {
            System.out.println("Outer finally");
        }
    }

    public static void meth() {
        try {
            int res = 3 / 0; // This will cause an ArithmeticException
        } finally {
            System.out.println("Finally in meth");
        }
    }
}
