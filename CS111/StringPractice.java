public class StringPractice {
public static void main(String[] args) {


}



public static String cipher(String str){
String code ="";
if (str.length()==0){
  return "";
}
for (int i =0 ;i<str.length();i++){
if (str.charAt(i)=='a'|| str.charAt(i)=='A'){
  code += 'z';
}
if (str.charAt(i)=='0'){
  code+='9';
}
char c = str.charAt(i);
c--;

code +=c+"";
}
code.toLowerCase();
  return code;
}

public static int r7 (int num){
int count =0;

String n = Integer.toString(num);

for(int i= 0; i<n.length();i++){
if (n.charAt(i)=='7')
count++;

}
return count;

}





}
