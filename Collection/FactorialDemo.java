package Collection;

@FunctionalInterface
interface FactorialInterface {
 int calculate(int n);
}
class Factorial {
 public int factorial(int n) {
     int fact = 1;
     for (int i = 1; i <= n; i++) {
         fact *= i;
     }
     return fact;
 }
}
public class FactorialDemo {
 public static void main(String[] args) {
     Factorial f = new Factorial();
     FactorialInterface fi = f::factorial;
     int num = 5;
     System.out.println("Factorial of " + num + " = " + fi.calculate(num));
 }
}

