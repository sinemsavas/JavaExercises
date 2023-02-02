import java.util.Scanner;

public class triangle2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int rows = input.nextInt();
		
		int i=0;             /*  4
		 							*
		 							**
		 							***
		 							*****/
		int j=0;
		int k=0;				
		
		for(i=0; i<rows; i++) {
			
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//ters hali
		/*for(i=rows; i>=0; i--) {
			
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/

	}

}
