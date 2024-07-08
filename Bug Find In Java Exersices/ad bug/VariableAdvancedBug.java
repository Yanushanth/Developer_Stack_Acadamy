public class VariableAdvancedBug {
    public static void main(String[] args) {
        int x = 5;
        double y = 3.14;
        boolean isJavaFun = true;
        char grade = 'A';
        
        int z = 10;  //{int z = 10;}
            
        
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("grade: " + grade);
        System.out.println("z: " + z);
        }
}
