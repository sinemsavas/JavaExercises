import java.util.Scanner;
//Please create a new program that prints out the number of arguments passed from the command line.
public class Task9 {

    public static void main( String[] args ) {

	/*	System.out.println("Hello!!!!\n");

		int x;

		for (x=0; x<10; x++) {
			System.out.println("Hello again: "+ x);
		}
		
		while (x-->0)		{					// postfix op and >0 / x'in kendi değerinden, 0 a gelene kadar loopa sok demek.
			System.out.println("x = "+x);}*/
    	/*for(int i=0; i<args.length; i++) {
    	System.out.println("Arguments: " + args[i]);
 
    	}*/
    	System.out.println(args.length + " argument passed the program.");
    	int i =0;
    	for(i=0; i<args.length; i++) {
    		System.out.println(i + "." + args[i]);
    		
    	}
    	while(i-->0) {//arrayi tersten yazdırma
    		System.out.println(i + "." + args[i]);
    	}
    	
    	
    	
    	
    	
    	
    	
    }
}