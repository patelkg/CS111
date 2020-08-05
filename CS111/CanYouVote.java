class CanYouVote{
public static void main(String[] args){
  System.out.println("Enter your age");
 int age = IO.readInt();
if (age>=18){
  IO.outputStringAnswer("Yes you can vote");

}  else if(age<18){
  IO.outputStringAnswer("No you cannot vote");
}


  }

}
