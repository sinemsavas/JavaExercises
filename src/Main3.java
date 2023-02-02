import java.lang.reflect.Array;
import java.util.Scanner;

//ARRAYLER
//java arraylerde birden fazla aynı veritipi saklanabilir,birden fazla veritipi saklanamaz
//array ismi.length ile array boyutu öğrenme
public class Main3 {
	
	public static int[] myArrays() {//fonksiyonun array döndürmesi
		
		//boyutu belli bir array tanımla, kullanıcının arrayi doldurmasını sağla, array değerlerini yazdır,
		//sonra girilen array değerlerinin ortalamasını alan bir fonksiyon yaz.
		
		int[] myArray = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Array değerlerini giriniz.");
		for(int i =0; i<myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}
		System.out.println("Array değerleri:");
		for(int j=0; j<myArray.length; j++) {
			System.out.println(myArray[j]);
		}
		return myArray; //fonksiyona array döndürme
		
	
		
	}
	public static void ortArrays(int[] myArray) {//fonksiyonun array alması
		
		System.out.println("Array değerleri ortalaması:");
		double sum=0;
		double divide =myArray.length;
		double ort = 0;
		for(int j=0; j<myArray.length; j++) {
		     sum = sum + myArray[j];
		}
		ort = sum/divide;
		System.out.println(ort);
		
		
	}

	public static void main(String[] args) {

		int[] myArray = {1,2,3,4,5};//eleman ekleyip çıkaramazsın
		
		int[] myEmptyArray = new int[3]; //flexible array tanımlama 
		
		myEmptyArray[0]=1;
		myEmptyArray[1]=2;
		myEmptyArray[2]=3;
		
		for(int i=0; i<=2;i++) {
			System.out.println("Array elemanı: " + myEmptyArray[i]);
			
		}
		
		
		ortArrays(myArrays());//array döndürme
		
		Scanner scan1 = new Scanner(System.in);
		int array1[] = new int[5];
		for(int i=0; i<array1.length; i++) {
			System.out.println("Değer giriniz: ");
			array1[i] = scan1.nextInt();

		}
		
		ortArrays(array1);//fonksiyona array gönderme
	
		int a = 15;
		double c = 3;
		System.out.println(a/c);
		
	
	}
}
