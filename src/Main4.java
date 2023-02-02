import java.util.Scanner;

//çok boyutlu arrayler
public class Main4 {
	
	public static void main(String[] args) {
		//2 boyultu arrayi 1. tanımlama yöntemi:
		int[][] myMatrix = {{1,2,3},{4,5,6}};
		System.out.println(myMatrix[1][0]);
		//2 boyultu arrayi 2. tanımlama yöntemi:
		int[][] myMatrix2 = new int[2][2];
		myMatrix2[0][0]=12;
		myMatrix2[0][1]=13;
		myMatrix2[1][0]=13;
		myMatrix2[1][1]=13;
		System.out.println(myMatrix2[0][1]);
		
		//Kullanıcıdan 2 boyutlu arrayim elemanlarını alma
		//Kullanıcıdan alınan verilerin yazdırılması
		
		int[][] degerler = new int[2][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Matrix değerini giriniz: ");
		int i=0;
		int j=0;
		for(i=0; i<degerler.length; i++) {
			
			for( j=0; j<degerler.length;j++) {
				degerler[i][j]=scan.nextInt();
				

			}
	
		}
		for( i=0; i<degerler.length; i++) {
			for( j=0; j<degerler.length;j++) {
				System.out.println(degerler[i][j]);

			}	
		}
		
		
	}

}
