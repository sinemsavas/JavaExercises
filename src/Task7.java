import java.util.Calendar;
import java.util.Date;
//Please expand the program from the exercise no. 5 of writing out the name of current month, using switch statement.
public class Task7 {

	public static void main(String[] args) {
		//date sınıfı
		Date today = new Date();//current date
		int Day = today.getDay();
		
		if(today.getDay()== 0 || today.getDay() ==6) {
			System.out.println("Today is weekend");
		}
		else {
			System.out.println("NO");
		}
		
		
		//calendar sınıfı ile
		Calendar c = Calendar.getInstance();  // The Calendar Object represents the current date.
		//Calendar's getInstance method returns a Calendar object whose calendar fields
		//have been initialized with the current date and time:
        int month = c.get(Calendar.MONTH) + 1;
		System.out.println("The number of the current month is: " + month);
		
		//Switch case:
		
		switch(month) {//break gelirse switchten tamamen çıkar
		case 1:
			System.out.println("JANUARY");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 11:
			System.out.println("november");
			break;
		default:
			System.out.println("other months");
			break;
		}

		
		
		
		
		

	}

}
