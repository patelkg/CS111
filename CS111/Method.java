public class Method  {
public static void main(String[] args) {
Song a = new Song ("Zello");
Song b = new Song ("Zello");
a.setYear(12);
b.setYear(12);
a.addWriter("Bob");
a.addWriter("Son");
b.addWriter("Son");
b.addWriter("Bob");
 boolean s = a.equals(b);
System.out.println(s);
}
}
