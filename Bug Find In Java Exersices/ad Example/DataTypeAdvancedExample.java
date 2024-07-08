public class DataTypeAdvancedExample {
    public static void main(String[]args){
    int a=10;
    double b=4.5;
    boolean isTrue = true;
    char letter ='C';

    double result = a+b;
    boolean isEquals = (a==b);
    int asciiValue = (int)letter;
    
    System.out.println("Result:"+result);
    System.out.println("ISEqual:"+isEquals);
    System.out.println("Ascii Value Of 'C':"+asciiValue);

    //attemting invalid conversion
    
    String str = "Hello";
    double invalidResult =Double.parseDouble(str); //This line should be corrected
    System.out.print("invalid Result:"+invalidResult);


        }
    }


