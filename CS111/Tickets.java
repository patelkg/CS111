public class Tickets {
 public static void main(String[] args) {
  int mileage = IO.readInt();
if (mileage<=60){
  IO.outputIntAnswer(0);
} else if (mileage>60 && mileage<=75){
  IO.outputIntAnswer(100);
} else if (mileage>75 && mileage<=90){
  IO.outputIntAnswer(200);

} else {
  IO.outputIntAnswer(500);
}


}

}
