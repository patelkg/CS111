public class NumberOfDigits{
 public static void main(String[] args) {
    System.out.println("Enter number");
    int num = IO.readInt();
    String newNum = Integer.toString(num);
    int digits = newNum.length();
      IO.outputIntAnswer(digits);

  }
}
