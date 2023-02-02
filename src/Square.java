import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
	 /* #### ##  ### #####
		#  # ##  # # #
		#  #     ### #
	 *  ####         #
	 */
	
		Scanner square = new Scanner(System.in);
		System.out.println("Enter number: ");
		int mySquare = square.nextInt();
		
		int i=0;
		int j=0;
		int k=0;
		
		 for(i=0; i<mySquare; i++) { 
			
			for(j=0; j<mySquare; j++) {//i=1
				if(i==0 || i==(mySquare-1)) {
				System.out.print("#");
			       }
				}
			
		    if(i!=0 && i!=(mySquare-1)) {
		    	System.out.print("#");
			    }
		    for(k=0; k<(mySquare-2);k++) {
						
					System.out.print(" "); 
					
					}
					if(i!=0 && i!=(mySquare-1)) {
						
						System.out.print("#");
					             }
					System.out.println(" ");
					
				
		}

	}

}
