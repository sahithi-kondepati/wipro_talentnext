package Collection;

@FunctionalInterface
interface PrimeCheckInterface {
 PrimeChecker check(int n);
}
class PrimeChecker {
 public PrimeChecker(int n) {
     if (isPrime(n)) {
         System.out.println(n + " is Prime");
     } else {
         System.out.println(n + " is Not Prime");
     }
 }
 private boolean isPrime(int n) {
     if (n <= 1) return false;
     for (int i = 2; i <= Math.sqrt(n); i++) {
         if (n % i == 0) return false;
     }
     return true;
 }
}
public class PrimeCheckDemo {
 public static void main(String[] args) {
     PrimeCheckInterface pci = PrimeChecker::new;
     pci.check(7);   
     pci.check(12);  
 }
}
