import java.util.Scanner;
public class FindMax{
public static void main(String[] args) {
  Scanner kbd = new Scanner(System.in);
  System.out.println("Enter 3 numbers");
int x =kbd.nextInt();
int y = kbd.nextInt();
int z = kbd.nextInt();
int max =x;
//BEFORE IO JAVA
if (y > max){
max = y;
}
 if (z > max){
   max = z ;
}

 System.out.println("The max number is : " + max);

}
}
