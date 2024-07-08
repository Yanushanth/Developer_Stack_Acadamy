public class VariableBug {
    public static void main(String[] args) {
        int x = 5;
        double y = 3.14;
        boolean isJavaFun = true;
        char grade = 'A';
        String undefinedVariable = "Add a Variable in Java Code"; // add Missing variable declaration
        
        // Missing variable declaration
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("grade: " + grade);
        System.out.println("undefinedVariable: " + undefinedVariable);
        }
}
