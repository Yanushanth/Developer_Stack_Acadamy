public class TypeCastingExample {
    public static void main(String[] args){
        int x =10;
        double y =5.5;

        int result1 = x + (int)y; //explicit casting
        double result2 = x/y; //implicit casting

        System.out.println("Result1:"+result1);
        System.out.println("Result2:"+result2);
    }
}
