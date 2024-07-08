public class OperatorBug {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int division = a / b; //  a / 0 is infinity so add relace 0 to b
        
        System.out.println("Division: " + division);
        }
       
}
