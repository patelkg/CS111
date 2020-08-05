public class ArrayPractice {

public static void main(String[] args) {
String Puppies = IO.readString();

String n  = Opposite(reversal(Puppies));

System.out.println(n);

}

public static double  avg (int [] a){
double sum = 0;
double average =0;
for (int i=0; i<a.length;i++){

sum +=a[i];
}
 average = sum /a.length;

return average;
}

public static char [] reversal (String s){
char [] newString = new char[s.length()];
for (int i=0;i<s.length();i++){
 newString[i]=s.charAt(i);
}


/*

indexOf(int a , String / char)

length()-gives out number of characters contained in string
charAt(takes in integer) - Tells the specific character at that index
indexOf(character/string) - outputs integer of where it is located



*/
return newString;

}
public static String Opposite (char[] s){
String st = "";
for (int i=0;i<s.length;i++){
    st+= s[s.length-i-1];
}
return st;


}





}
