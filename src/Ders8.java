import java.util.Scanner;

public class Ders8 {
 public static void main(String[] args) {
//Kullanıcıdan notunu alıp (70) geçip geçmediğini if bloğu ile ekrana yazdır.
// uyarı: if her zaman kontrol edilir, else if sadece yukarıdaki if sağlanmazsa kontrol edilir.
			
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("Notunuzu giriniz: ");
	int grade = scan.nextInt();
	
	if(grade>90) {
		System.out.println("AA");
	}
     if (grade>93) {
		System.out.println("BA");
	}
	else if (grade>75) {
		System.out.println("BB");
	}
	else {
	    System.out.println("FF");
	    }

 }
}
