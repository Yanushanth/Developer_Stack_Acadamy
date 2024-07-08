public class TypeCastingAdvancedExample {
    public static void main(String[] args) {
        int x = 10;
        double y = 5.5;
        
        // Widening conversion
        double result1 = x + y; 
        
        // Narrowing conversion
        int result2 = (int) (x / y); 
        
        System.out.println("Widening Conversion Result: " + result1);
        System.out.println("Narrowing Conversion Result: " + result2);
        }
}
