package Collection;

@FunctionalInterface
interface WordCount {
 int count(String str);
}

//Class with Lambda usage
public class MyClassWithLambda {
 public static void main(String[] args) {
     WordCount wc = (str) -> str.split("\\s+").length;
     String input = "Lambda expressions in Java are powerful";
     int result = wc.count(input);
     System.out.println("Input String: " + input);
     System.out.println("Word Count: " + result);
 }
}

