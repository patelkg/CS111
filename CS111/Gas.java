public class Gas {
        public static void main (String [] args){
          System.out.println("Enter in the price per gallon");
          double pricePerGallon = IO.readDouble();
          System.out.println("Enter number of gallons");
          double numGallon = IO.readDouble();
          System.out.println("Are you going pay with a credit card ? (true/false)");
          String creditOption =IO.readString();
          double total = pricePerGallon * numGallon;
          if(pricePerGallon<0 || numGallon<0){
            IO.reportBadInput();
          } else if (pricePerGallon>=0 && numGallon>=0) {
            if (creditOption.equalsIgnoreCase("true")){
              total = total *1.10;
            } else if (creditOption.equalsIgnoreCase("false")){
              total = total;
  }
IO.outputDoubleAnswer(total);
    }
  }
}
