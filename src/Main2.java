import java.util.Scanner;

//Main çok dolduğu için buna geçtim

//REFERANSLAR
public class Main2 {
	
	public static void main(String[] args) {
	/*	// Car araba1 ve Car araba2 birer referanstır.
		// Her referans bellekteki objeyi işaret eder.(hepsi değil)
		Car araba1 = new Car("Purple", "BMW", 7, 7);
		Car araba2 = new Car("Silver", "toyota", 8.5, 2);
		
		Car araba3 = null;//boşluğu işaret eden bir referans oluşturdum. objeyi işaret etmez, bellekte boş bir kutuyu işaret eder
		araba3.Print();//RUNTIME ERROR'a sebep olur, çünkü bu bir obje değil, boş yere işaret eden bir referanstır.
		*/
		
		//REFERANS KIYASLAMA:
		/*Sonuç: Referanslar eşit olmayacaktır. Çünkü scan1 bellekte Sinem stringinin eşitlendiği bir objeye işaret ederken,
		  scan2 bellekte Sinem stringinin eşitlendiği başka bir objeye işaret eder.      */
		//String veri tipinden obje oluşturma:
		String scan1 = new String("Sinem");
		String scan2 = new String("Sinem");
		
		/*if(scan1 == scan2) {
			System.out.println("Referanslar eşit.");
		}
		else {
			System.out.println("Referanslar eşit değil.");
		}*/
		
		if(scan1.equals(scan2)) {
			System.out.println("Referanslar eşit.");
		}
		else {
			System.out.println("Referanslar eşit değil.");
		}
		
		
		
	}

}
