import java.util.Date;

//As in the exercise 3, but a 
//program should also write in a number indicating the day of the week.
public class Task4 {
	public static void main(String[] args) {
		
		Date today = new Date();/// New Object that represents the current time (today) is created.
		System.out.println("Date is: " + today);
		System.out.println("Day of the week: " + today.getDay());// 21 ()--> 3
		System.out.println("The number of the current month is: " + (today.getMonth() + 1)  ); //round brackets are essential - please check what will happen without them.

	        /* The merged text, which consists of the text and the int value, which is AUTOMATICALLY converted to a string, will be written on the screen */
		
		
		
		
		
	}
}
