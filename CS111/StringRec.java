public class StringRec {
// assuming that the numbers are single digits 2-9 , 1 will not be written as only the letter will represent 1
public static String decompress(String compressedText){
String str="";
if(compressedText.length()<=1){
return compressedText;
}

if (Character.isDigit(compressedText.charAt(0))){
// if char is number
char num = compressedText.charAt(0);
if (num!='0'){
  num--;
str = str+ compressedText.substring(1,2)+decompress(num+compressedText.substring(1));
}
// while num is decreasing when the number is 1 and a letter like "1a"
if  (num=='1'){
  str = str +decompress(compressedText.substring(2));
}

} else {
//if char is a letter
str = str + compressedText.substring(0,1)+decompress(compressedText.substring(1));


}


return str;
}

public static void main(String[] args) {
  String s = IO.readString();
IO.outputStringAnswer(decompress(s));
}
}
