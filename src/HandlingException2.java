public class HandlingException2 {
    public  static int  division( int x, int y )  {
        try {
        	return   (x / y);
        }
        catch (ArithmeticException e) {
        	System.err.println("Exception was caught!");
        	return 0;
        }
    }
    public static void main( String[]  a) {
        System.out.println( division(2,0) );
        System.out.println("After Exception");//return 0 dediği için çalışır
    }
}