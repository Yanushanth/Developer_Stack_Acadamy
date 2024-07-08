public class StringBug {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = str1 +str2; /* missing this part String concatenatedString = str1 +str2; */
        String substring = concatenatedString.substring(0, 5);
        
        System.out.println("Substring: " + substring);
    }
}
       

