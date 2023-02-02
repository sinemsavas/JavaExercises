import java.util.Scanner;

public class Ders11 {

	public static void main(String[] args) {
		//switch-case durumları
		// atm örneği, bakiyemize göre para çekip yatıralım, havale yapalım vs.
		// default istenmeyen durumlar için kullanılır
		//bakiyenden fazla miktarda para çekmek isterse diye bunu da düşünerek kodu yaz.
		
		
		int balance = 1200;
		System.out.println("1: Balance State ");
		System.out.println("2: Add Money ");
		System.out.println("3: Withdraw Money ");
		System.out.println("4: No more Process ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your selection: ");
		int User_Enter = scan.nextInt();
		
		switch(User_Enter) {
		
		case 1:
			System.out.println("Your Balance is: " + balance);
			break;
		case 2:
			System.out.println("How much money do you want to add? ");
			float add = scan.nextFloat();
			balance += add;
			System.out.println("Your new balance: " + balance);
			break;
			
		case 3: 
			System.out.println("How much money do you want to withdraw?");
			float withdraw = scan.nextFloat();
			
			if(withdraw<=balance) {
			balance -= withdraw;
			System.out.println("Your new balance: " + balance);
			break;
			}
			else {
				System.out.println("Error");
				break;
			}
		case 4:
			System.out.println("Exit ");
			break;
			
		default:
			System.out.println("Error");

		}

		
	}

}
