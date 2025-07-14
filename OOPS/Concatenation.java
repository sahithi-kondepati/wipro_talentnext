package Oops;

public class Concatenation {
    public static void main(String[] args) {
        String str1 = "Mark";
        String str2 = "kate";  
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            str2 = str2.substring(1);
        }
        String result = str1 + str2;
        System.out.println(result);
    }
}
