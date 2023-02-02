import java.util.Scanner;
public class Ders14 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			
			System.out.println("Java");
			i++;
			
		}
		System.out.println("Döngü bitti");
		
		//Faktöriyel bulma programı:
		//zorlaştır: 1/2 nin faktöriyeli (pi^1/2)/2'miş gibi alıp, float sayıların fak. bul.
		int tut = 1;
		Scanner girdi = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int gir = girdi.nextInt();
        int asil;
        asil = gir;
        
		while(gir>0) {
		System.out.println(tut);
		tut = gir*tut;
		--gir;
		}
		System.out.println(asil+ "' in/nin faktöriyeli "+ tut + " dır. ");				
	}
	

}
