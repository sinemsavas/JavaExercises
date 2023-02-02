/*
	public static void main(String[] args) {
		
		//TRUE
		System.out.println(Integer.parseInt("1"));
		try{//FALSE
		System.out.println(Integer.parseInt("merhaba"));
		}
		catch(NumberFormatException e) {
			System.out.println("Sadece string tanımlanmış integerlar için çalışır..");
			//System.out.println(e.getMessage());
		}
	}*/
/*
 class SimpleException extends Exception {
		
		private String tmp = "Simple exception";
		
		public SimpleException() {};
		public SimpleException(String tmp) { this.tmp = tmp; };
		
		public String toString() { return tmp; }
	}

 public class ThrowingSimpleException {

		  public static void main (String args[]) throws Exception { // Can you remove "throws Exception"?

		    throw new SimpleException("Testing throwing Exception");
		  }

		}*/

class SimpleRuntimeException extends RuntimeException {//runtimeexception dediğimizde, mainden throw SimpleRuntimeException kaldırsak bile çalışır.
	
	private String tmp = "My exception";
	
	public SimpleRuntimeException() {};
	public SimpleRuntimeException(String tmp) { this.tmp = tmp; };
	
	public String toString() { return tmp; }
}

public class ThrowingSimpleRuntimeException {

	  public static void main (String args[]) {  // Can you remove "throws Exception"?

	    throw new SimpleRuntimeException("Testing throwing RuntimeException");
	  }

	}




