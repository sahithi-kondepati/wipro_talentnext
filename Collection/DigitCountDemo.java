package Collection;

@FunctionalInterface
interface DigitCountInterface {
 int count(int n);
}
class DigitUtil {
 public static int digitCount(int n) {
     return String.valueOf(n).length();
 }
}
public class DigitCountDemo {
 public static void main(String[] args) {
     DigitCountInterface dci = DigitUtil::digitCount;
     int num = 12345;
     System.out.println("Number of digits in " + num + " = " + dci.count(num));
 }
}
