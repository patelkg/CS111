public class AppendRec {

public static String appendNTimes(String original , int n){
  if (n<0){
    return "Bad Input";
  }

if (n==0){
  return original;
} else {
return  original+appendNTimes(original,n-1);
}

}

public static void main(String[] args) {
System.out.println("Enter in String and number");
String str = IO.readString();
int num = IO.readInt();
IO.outputStringAnswer(appendNTimes(str,num));
}



}
