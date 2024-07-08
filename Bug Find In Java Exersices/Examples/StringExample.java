public class StringExample{
    public static void main (String[]args){
        String str1 = "Hello";
        String str2 ="World";

        String concatenatedString =str1 + str2;
        int length = concatenatedString.length();
        String substring = concatenatedString.substring(0,5);
        boolean isEqual = str1.equals(str2);

        System.out.println("concatenatedString:"+concatenatedString);
        System.out.println("Length:"+length);
        System.out.println("Substring:"+substring);
        System.out.println("ISEqual:"+isEqual);
        
    }
}