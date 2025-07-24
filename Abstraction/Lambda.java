package Abstraction;

@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}
public class Lambda {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;
        System.out.println("Sum using t1: " + t1.myFunction(1, 2, 3));      // 6
        System.out.println("Product using t2: " + t2.myFunction(2, 3, 4));  // 24
    }
}
