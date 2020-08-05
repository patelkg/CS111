public class practice{
  public static void main(String[] args) {
char [] a = new char [] {'C','Q' ,'S','A', 'X', 'B', 'T'};
iS(a);


for (int i=0;i<a.length;i++){
  System.out.println(a[i]);
}
  }

public static void selectionS(char[] a){
 for (int i=0; i<a.length;i++){
     int min =i;
     for (int j =i+1; j<a.length;j++){
       if(a[min]>a[j])
       min=j;
     }
    if (min!=i){
    char temp = a[min];
    a[min]=a[i];
    a[i]=temp;

    }

 }


}
public static void iS(char [] items){
  for (int i=1;i<items.length;i++){
  int j=i;
  char temp = items[i];
     while (j>0 && items[j-1]>temp){
       items[j]=items[j-1];
       j=j-1;
     }
  items[j]=temp;
  }
}
}
