public class Zoo {
 public static void main(String[] args) {
  System.out.println("Enter number of zoos");
  int zooNum = IO.readInt();
int snakes =0;
int giraffes= 0;
int lions=0;
for (int i =1; i<=zooNum;i++){
  System.out.println("Enter the number of giraffes " + "from zoo " + i);
  int giraffeNum = IO.readInt();
  System.out.println("Enter the number of lions " + "from zoo " + i);
  int lionNum = IO.readInt();
System.out.println("Enter the number of Snakes " + "from zoo " + i);
int snakeNum = IO.readInt();


snakes+=snakeNum;
lions+=lionNum;
giraffes+=giraffeNum;
}

IO.outputIntAnswer(giraffes);
IO.outputIntAnswer(lions);
IO.outputIntAnswer(snakes);

}
}
