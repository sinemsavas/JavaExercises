import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//remove deprecated method 
//and use formatter to see following text on the screen, e.g:
public class Task6 {

	public static void main(String[] args) {
		
		Date today = new Date();//Today's date

		SimpleDateFormat now = new SimpleDateFormat("yyyy.MM.dd HH.mm");//date formatlama/biçimlendirme
		System.out.println("Today is: " + now.format(today));
		
		
	

	}

}
