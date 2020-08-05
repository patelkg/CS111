public class Compress {
  public static String compress (String original){
    String str = "";
    int count =1;
    if (original.length()<1){
      return "";
    }
    char let = original.charAt(0);

    for (int i =1; i<original.length();i++){
      if (let==original.charAt(i)){
        count++;
      }
      else if (let != original.charAt(i)){
        if (count ==1){
          str = str+let;

        }
        else {
          str = str + Integer.toString(count) +let;
        }
        count =1;
        let = original.charAt(i);
      }
}
if (count ==1){
    str = str+let;

}else {

str = str + Integer.toString(count)+let;
}
return str;
}

public static void main(String[] args) {
  System.out.println("Enter String");
  String s = IO.readString();
  IO.outputStringAnswer(compress(s));
}
}
