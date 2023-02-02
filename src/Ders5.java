import java.util.Scanner;

public class Ders5 {

	public static void main(String[] args) {
		System.out.println("Bir sayı giriniz: ");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		/*System.out.println("Girilen sayı: "+ a++);//aşağı satırda arttırır.
		System.out.println(a);
		*/
		System.out.println("Girilen sayı: "+ (++a));//bu satırda arttırır.
		System.out.println(a);
		

	}

}
