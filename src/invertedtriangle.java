import java.util.Scanner;
/*
 *   #######
      #####
       ###
        #

 */
public class invertedtriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int rows = input.nextInt();
		
		int i=0;
		int j=0;
		int k=0;
		
		for(i=rows; i>=0; i--) {
			if(i!=rows) {
			for(j=1; j<=rows-i; j++) {
				System.out.print(" ");
				
			  }
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
