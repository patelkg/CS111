public class BuyingApples{
public static  void main(String[] args) {
System.out.println("Enter cost per lb ");
double costPerPound = IO.readDouble();
System.out.println("Enter number of apples");
double numApples = IO.readDouble();
double total = costPerPound * numApples;
if (costPerPound<0){
IO.reportBadInput();
} else {
    IO.outputDoubleAnswer(total);
}

}
}
