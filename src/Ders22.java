//String sınıfı
public class Ders22 {

	public static void main(String[] args) {
		//String referanslarını s1 ve s3 gibi oluşturduğumuzda ikisi de aynı yeri gösterir.
		String s1 = "Sinem";
		String s3 = "Sinem";
		//String referansını obje olarak tanımlarsak, her birinde yeni bir obje oluşturup, stringi onun içine yerleştirir.
		String s2 = new String("Sinem");
		
		if(s1==s3) {
			System.out.println("Eşit");
	}
		else {
			System.out.println("Değil");
		}
		
		//String methotları:
		//uzunluk için length()
		String a = new String("Merhaba");
		int uzunluk =a.length();
		System.out.println(uzunluk);
		//içerisindeki karakterlere ulaşmak için charAt();
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(2));
		//başlangıç değerini bulma
		System.out.println(a.startsWith("Mer"));
		//son değeri bulma
		System.out.println(a.endsWith("aba"));
		
		
		
}
}