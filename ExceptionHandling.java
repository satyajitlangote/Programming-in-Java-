public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            
            int num1 = 10;
            int num2 = 0;              
          int result = num1 / num2; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
          
            System.out.println("End of the try-catch block.");
        }
    }
}
