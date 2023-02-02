//METHOD OVERLOADING:
		//bir fonksiyonu aynı isimle birden fazla kez farklı şekilde kullanabiliriz:).
		
public class Ders20 {
	public static String myFunction(String fname, String fsurname, int grade) {
		String sum = fname+fsurname+grade;
		return(sum);
	}
	public static void myFunction(String fname, String fsurname) {
		
	}
	public static void myFunction(String fname) {
		
	}
	

	public static void main(String[] args) {
		//ogrenci adını ve notunu alan fonksiyon, aynı isimli fonks. ama sadece ismini alsın, aynı isimli fonksiyon aynı zamanda soyadını alsın
		
		myFunction("Sinem", "Savaş", 22);
		myFunction("Sinem", "Savaş");
		myFunction("Sinem");
		System.out.println(myFunction("Sinem", "Savaş", 22));
		System.out.println("Sinem" + "Savaş" + 22);//integer ve stringi toplayabilirsin
		
		
		
	}

}
