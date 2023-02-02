//return() nedir? void nedir?
//fonksiyonlar iç içe nasıl kullanılır?
		//değer vermeyen fonksiyonlar için void kullanılır.
		//return'e integer değer döndürüyorsak void yerine int yazarız

public class Ders19 {
	public static String myFunction(String fname) {
		String nameSum = fname + "Savaş";
		return(nameSum);

	}
	public static int mySum(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		int sum = a+b;
		return(sum);
		
	}
	public static int mySum2(int c) {
		System.out.println(c);
		
		return(c);
		
	}
	public static void main(String[] args) {
		myFunction("Sinem");
		mySum(2,3);
		System.out.println("Benim toplamım: " + mySum2(mySum(2,7)));
		
		String a = myFunction("Sinem");
		System.out.println("İsmim: " + a);
		
		
	}
}
