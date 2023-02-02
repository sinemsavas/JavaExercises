
//static ifadesi: static sıfırlanamaz ve silinemez demektir. 
// Final tipindeki bir alan program içinde değiştirilemez.
//Static alan değiştirilebilir. Eğer final tipindeki bir değişikeni değiştirmeyi denerseniz program hata verecektir.
//Static anahtar kelimesi kullanılarak oluşturulan değişkenler nesne değişkeni değil “sınıf değişkeni” olarak adlandırılırlar.
//month arrayini mainde kullanmak için static yapmak zorundasın.
//private static dersen, sınıf içinde kullanabilirsin demektir. (yeni obje oluşturmadan)
//private o sınıf dışından erişilemez demektir.
//static ile sınıftan doğrudan değişkeni kullanabiliriz, referansa ihtiyaç duymadan
//bu şekilde değişkeni main içinde değil de class içinde tanımlarsak, oluşturacağımız diğer methodlarda da ay arrayine erişebiliriz, private olduğu için sadece bu classta erişilir.
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task8 {	

	private static String[] month = {"jan","feb","marc", "april","may","june","july", "august","sep","oct","nov","december"};
    public static void main( String[] args ) {
    	
    //içinde ayların olduğu array oluştur, calendar ile bu ayın değerini bul

    	//System.out.println(month[10]);
    	
    Calendar today = Calendar.getInstance();//calendar objesi bugünün tarihini tutar.

    int monthoftoday = today.get(Calendar.MONTH);
    	
    System.out.println(month[monthoftoday]);
    	
    	
    	
    	
    	

	}

}
