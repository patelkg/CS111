public class Random{
public static void main(String[] args) {

  System.out.println("Enter terminating value");
  double num = IO.readDouble();
  double tNum = num;
  double max = Integer.MIN_VALUE;;
  double max1= Integer.MIN_VALUE;
  int count =0;
  System.out.println("Enter a number list");
  do {
  //System.out.println(num);

  num = IO.readDouble();
  if (num==tNum){
  System.out.println("terminating number enterd");
  if (count ==0){
    System.out.println("Enter new number");
    num=IO.readDouble();
  } else if (count>0) {
  break;
  }

  }

  if (num>max){
    max = num ;
  }

    num = IO.readDouble();

    if (num==tNum){
    System.out.println("terminating number enterd");

    if (count ==0){
      System.out.println("Enter new number");
      num=IO.readDouble();
    } else if (count >0){
  break;

    }

    }
  if (num>max1){
   max1=num;
  }
   if (num>max1 && num<max){
     double i = num;
     max1 = num;

   }



  if (max<max1){
  double a =max;
  max = max1;
  max1=a;

  }

   if (max==max1){
  max = max ;
  max1 = max1;

   }
   count++;

  } while (num!=tNum);

  IO.outputDoubleAnswer(max);
  IO.outputDoubleAnswer(max1);









  }
  }


}


}
