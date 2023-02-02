import java.util.Scanner;

public class triangle {
/*
 *        *
         ***
        *****
       *******
      *********
 * 
 * entering number of rows
 * for'un içinde if kullanmaktansa, ifin içinde for kullan!!
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int rows = input.nextInt();
		
		int i=0;
		int j=0;
		int k=0;
		
		
		/*for(i=0; i<=rows+1;i++) {//satır
			
			for(j=(rows-1); j>0; j--) {//sütun boşlukları
				
				System.out.print(" ");
				
				}
			rows=rows-1;

			while(k!=2*(i+1)-1) {//satırdaki kareler 1-3-5-7
				
				System.out.print("#");
				k++;
			}
			k=0;
            
			System.out.println("");
		}*/
		//2.yol
		for(i=1; i<=rows; i++) {
			for(j=1; j<=rows-i; j++) {//i arttıkça boşluk azalmalı
				System.out.print(" ");
			}
			while(k<2*i-1) {
			System.out.print("#");
			k++; 
			    }
			k=0;
			System.out.println("");
		}
		
		
		

	}

}
