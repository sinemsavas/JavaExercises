/*
class MyException  extends  Exception {
      private String s;
      public MyException(String message) {
            s = message;
      }
      public String toString() { return s; }
}


public class HE3 {
    public  static int  division( int x, int y ) throws MyException  {
    	if (y==0) throw new MyException("Division by Zero");
        return   (x / y);
    }
    public static void main( String[]  a) throws MyException {   // We inform that main can throws MyException
        System.out.println( division(2,0) );
        System.out.println("After Exception");
    }
}*/