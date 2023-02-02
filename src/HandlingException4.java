//mainin throw Exceptionclassname yerine bu yapılabilir:
//Handling MyException in main method
//tekrar bak!!!!!!!!
//classın başında public gibi bir ifade yok, bu default demektir. sadece kendi paketi içinde kullanılabilir, import etsen bile kullanamazsın
//class eğer protected olursa, yine başka paketlerden erişemezsin ama default'tan farklı olarak, farklı paketteki sınıflar bu sınıftan türerlerse erişiliebilirler.
//protected ise ve classtan üretildiyse, public gibi davranır.
//bir class SADECE default veya public olabilir.
class DENEME extends Exception {
	/*public DENEME() {
		System.out.println("hatalı");
	}*/ // SADECE YAZI ÇIKAR
	
	private String s;
	public DENEME(String hata) {
		s = hata;
	}
	
	public String toString() {
		return s;
	}
}

public class HandlingException4 {
 public  static int  division( int x, int y ) throws DENEME  {
 	if (y==0) throw new DENEME("HATA VER");
     return   (x / y);
 }
 public static void main( String[]  a)  {
     try {
			System.out.println( division(2,0) );
		}
     catch (DENEME e) {
    	 
			e.printStackTrace();//programcının asıl sorunun nerede ortaya çıktığını anlamasına yardımcı olur.
			System.err.println("Exception: " + e);//System.err.println: hatalar için kullanılır
		}
     System.out.println("After Exception");//çalışır, ondan sonra err.println çalışır.
 }
}