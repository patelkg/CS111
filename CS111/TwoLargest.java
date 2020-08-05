public class TwoLargest{
public static void main(String[] args) {

System.out.println("Enter terminating value");
double num = IO.readDouble();
double tNum = num;
double max = Integer.MIN_VALUE;
double max1= Integer.MIN_VALUE;
int count =0;
System.out.println("Enter number list");

do {
num = IO.readDouble();
if (num==tNum){
System.out.println("terminating number enterd");
if (count <=1){
  while (num==tNum){
  System.out.println("Enter new number");
  num=IO.readDouble();
}
} else if (count>1) {
break;
}
}

if (num>max){
  max1 = max ;
  max = num;
}
else if(num > max1){
  max1 = num;
}
 count++;

} while (num!=tNum);
IO.outputDoubleAnswer(max);
IO.outputDoubleAnswer(max1);
}

}
