import java.util.Date;

//writing out the information if there is the weekend  time now or not.
public class Task5 {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println("Today's Date is: " + today);
		
		int day;
		day = today.getDay();
		System.out.println("Today's number: " + day);
		
		/*//weekend or not
		if(day == 0 || day == 6) {
			System.out.println("Today is the weekend:)");
			
		}
		else {
			System.out.println("Not weekend:(");
		}*/
		if(today.getDay() == 0) {
			System.out.println("Today is sunday.");
		}
		
		if((today.getDay() == 0) || today.getDay()==6) {
			System.out.println("Today is the weekend:)");
			
		}
		else {
			System.out.println("Not weekend:(");
		}
		
		

	}

}
