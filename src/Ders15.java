
public class Ders15 {

	public static void main(String[] args) {
		//for döngüsü (do/while atladım)
		//Java nested loops to create a pattern 1'den 5'e kadar piramit oluşturma
		int i;
		int j = 0;
		for(i=0; i<4; i++) {
			System.out.println("i= " + i + "\n");
		
		
		for(j = 0; j<4; j++) {
					System.out.println(" i= " + i +" j= " + j);
				}
				
		}
		System.out.println("j= " + j + "\n");
		System.out.println("i= " + i + "\n");
		
		/* create this 
		 *  1
			1 2
			1 2 3
			1 2 3 4
			1 2 3 4 5 
		 */
		
		int a=1;
		int b=1;
		int counter =1;
		while(a<=5) {
			for(b=1;b<=a;b++) {
				
				System.out.print(b + " ");
				counter +=1;
			//	System.out.println("\n");
				
			}
			System.out.println();
			a++;
		}
		
		
		
		
		
		
		
}

}
