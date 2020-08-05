public class Work {
public static void main(String[] args) {
  int n = IO.readInt();
//horizontally
for(int i = 0; i <= n/2; i++){
    for(int j = 0; j < i; j++){
//       System.out.print("*");

}
//   System.out.println();
}
for(int q = (n/2); q <=n; q++){
    for(int a = q; a>n-1; a--){
        System.out.print("*");

    }
    System.out.println();
}
}


}
