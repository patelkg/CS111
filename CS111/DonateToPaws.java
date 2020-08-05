public class DonateToPaws{

public static double donationFee(double donationAmount){
  double result =0;
if (donationAmount<15000){
if (donationAmount<=150 && donationAmount>=0){
  result = 3;
}
 if (donationAmount>150 && donationAmount<1500) {
 result = Math.max(8,(donationAmount*0.04));
 }
  if (donationAmount>=1500 && donationAmount<15000){
result =  Math.max(20,donationAmount*0.01);
  }

} else if (donationAmount>=15000) {

result += 150;
donationAmount-=15000;

if (donationAmount>=4000 && donationAmount>0){
result = result+(80);
 donationAmount-=4000;
}  else {
 if (donationAmount<4000 && donationAmount>0){

result = result + (donationAmount*0.02);
donationAmount-=4000;
 }
}
if (donationAmount>0) {
result = result + (donationAmount*0.03);
}
}
 return result ;
}

public static void main(String[] args) {
  System.out.println("Enter amount of donation");
  double num = IO.readDouble();

IO.outputDoubleAnswer(donationFee(num));


}

}
