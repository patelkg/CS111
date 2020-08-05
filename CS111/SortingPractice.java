public class SortingPractice {
public static void main(String[] args) {
int [] a = new int [] {5,3,1,2};
int [] b =selectionSort(a);
for (int i=0; i<b.length;i++){
  System.out.println(b[i]);
}
}
// Still fixing
public static int [] selectionSort(int []a){
int n = a.length-1;
int max =a[n], maxindex=n;
while (n>1){
for (int i=0; i<n;i++){
  if(a[i]>max){
    maxindex=i;
    max = a[i];
  }
}

int temp = a[n];
a[n]=a[maxindex];
a[maxindex]=temp;
n--;
}
return a ;
}





}
