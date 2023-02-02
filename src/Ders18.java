import java.util.Scanner;

public class Ders18 {
	//PARAMETRELER(Arguments/Parameters): fonksiyonlar sadece çağırıldıkları zaman çalışırlar.
	//Fonksiyonları çalışıtırırken değişkenleri fonksiyona iletebiliriz, buna parametre denir.
	
	public static void myFunction(String yourName) {
		System.out.println("Selam " + yourName);
	}
	public static void mySum(int a, int b, int c) {
	//3 değer alan ve toplama yapan fonksiyon:
		int mySum;
		System.out.println("Toplam fonksiyonuna hoş geldiniz. ");
		mySum = a+b+c;
		System.out.println(mySum);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	/*	Scanner input = new Scanner(System.in);
		System.out.println("Ismınızı gırınız.. ");
		String enterName = input.nextLine();
		myFunction(enterName);*/
		
	/*	Scanner fname = new Scanner(System.in);
		System.out.println("1. sayiyi giriniz: ");
		int enterNumber1 = fname.nextInt();
		System.out.println("2. sayiyi giriniz: ");
		int enterNumber2 = fname.nextInt();
		System.out.println("3. sayiyi giriniz: ");
		int enterNumber3 = fname.nextInt();

		mySum(enterNumber1, enterNumber2, enterNumber3);*/
		
		mySum(1,4,5);
		
	}

}
