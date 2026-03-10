public class ReverseString {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        String s = "GLA";
        System.out.println(reverseString(s));
    }
}