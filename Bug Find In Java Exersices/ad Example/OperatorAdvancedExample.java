public class OperatorAdvancedExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int division = 0;
        int remainder = a % b;
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        
        // Handling division by zero
        if (b != 0) {
        division = a / b;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
        System.out.println("isEqual: " + isEqual);
        System.out.println("isGreater: " + isGreater);
        }
       
}
