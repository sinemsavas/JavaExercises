import java.util.Locale;
import java.util.Scanner;

public class Ders2 {
	
	public static void main(String[] args) {
	/*
	 * Kullanıcıdan bilgi alan Scanner classını, paketten çekip, scan objesi oluşturduk, scan objesiyle fonksiyon kullandık.
	 */
	Scanner scan = new Scanner(System.in);
	/*
	scan.useLocale(Locale.US);
	System.out.println("Bir sayı giriniz: "); 
	
	double a = scan.nextDouble();//integer deger alan fonksiyon
	
	System.out.println("A degisken degeri: "+ a);
	*/
	System.out.println("Bir şey yaziniz: ");
	
	String b = scan.nextLine();
	
	System.out.println("Girilen yazi: " + b);
	
	
	
	
	
	
	
	}

}
