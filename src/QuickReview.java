import java.util.Scanner;

public class QuickReview {
	public static void main(String[] args) {
		/*System.out.println("Enter a number: ");
		Scanner imscanning = new Scanner(System.in);
		int myInt = imscanning.nextInt();
		System.out.println(myInt);
		
		System.out.println("İsminizi giriniz: ");
		Scanner isim = new Scanner(System.in);
		String myName = isim.nextLine();
		System.out.println("Adınız: " + myName);
		
		int a = 5;
		int b = 9;
		int c = 5;
		System.out.println(a<b);
		System.out.println(b==c);
		System.out.println(a==c);
		int i = 0;
		while(i<30) {
		System.out.print("*");//javada yan yana yazdırmak için println yerine print kullanılır.
		i += 1;
		}
		i = 0;
		//if bloğu kullanarak, kullanıcıdan notunu alıp 70'İ geçip geçmediğini söyle
		System.out.println("\nEnter your grade: ");//alt satıra geçmek için stringin içinde /n yaz.
		Scanner usergrade = new Scanner(System.in);
		int yourGrade = usergrade.nextInt();
		
		if(yourGrade>=70) {
			System.out.println("YOU PASS 70");
		}
		else{
			System.out.println("NO");	
		}
		while(i<30) {
		System.out.print("*");
		i +=1;
		}
		System.out.println("\n");
		System.out.println((4<6) && ("sinem" == "sinem"));
		System.out.println((8==8) || ("sinlm" == "sinem"));
		
		System.out.println("sinem" == "sinem");
		
		System.out.println("String Comparison");
		String name1 = "Jale";
		String name2 = "Jale";
		System.out.println("Enter name: ");
		Scanner deneme = new Scanner(System.in);
		String name3 = deneme.nextLine();
		String name4 = deneme.nextLine();
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1.equals(name3));//equals(string); methodu
		System.out.println(name4 == name3);// name3 ve name4 objesi aynı obje değildir
		System.out.println(name4.equals(name3));//name3 ve name4 objesinin gerçek değerleri kontrol edilir
		
		/*uygulama: kullanıcı adı ve parola belirli olan bir sistemde,
		kullanıcı adı ve şifre alan ve if else yapısı ile bilgilerin doğru/yanlış olduğunu anlama*/
		/*i = 0;
		String userName ="sinemssavas";
		String userPassword ="zort123";
	
		while(i<4) {
	    System.out.println("Enter your user name: ");
		Scanner enter = new Scanner(System.in);
		String enteringName = enter.nextLine();
		System.out.println("Enter your user password: ");
		String enteringPassword = enter.nextLine();
		if((userName.equals(enteringName))&&(userPassword.equals(enteringPassword)) ) {
			System.out.println("True Password and Username.");
		}
		else if(!(userName.equals(enteringName))&&!(userPassword.equals(enteringPassword))) {
			System.out.println("Wrong name and password");
		}
			
		else if((userName.equals(enteringName))&&!(userPassword.equals(enteringPassword))) {
			System.out.println("Wrong password");
		}
		else if(!(userName.equals(enteringName))&&(userPassword.equals(enteringPassword))) {
			System.out.println("Wrong name");
		}
		else {
			System.out.println("Someting went wrong, please check!");
		}
		i +=1;
		}*/
		
		//switch-case durumları
				// atm örneği, bakiyemize göre para çekip yatıralım, havale yapalım vs.
				// default istenmeyen durumlar için kullanılır
				//bakiyenden fazla miktarda para çekmek isterse diye bunu da düşünerek kodu yaz.
		
		
		
		float bakiyem = 440;
		System.out.println("1: Para çek.");
		System.out.println("2: Para yatır.");
		System.out.println("3: Bakiyeni gör.");
		System.out.println("4: Exit.");
		Scanner number = new Scanner(System.in);
		System.out.println("İşlem istediğiniz sayıyı giriniz.");
		int process = number.nextInt();
		int exit = 0;
		
		while(exit != 4 && process != 4) {
		switch(process) {
		
		case 1:
			System.out.println("Çekmek istediğiniz miktarı giriniz: ");
			int cek = number.nextInt();
			if(bakiyem>=cek) {
			bakiyem -=cek;
			System.out.println("Yeni bakiye: " + bakiyem);break;}
			else {
			System.out.println("İşlemi kontrol ediniz");break;
			}
			
			
		case 2:
			System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
			int yatir = number.nextInt();
			bakiyem +=yatir;
			System.out.println("Yeni bakiye: " + bakiyem);
			break;
			
		case 3:
			System.out.println("Bakiyeniz: "+ bakiyem);
			break;
		case 4: 
			System.out.println("Exit");
			break;
		
		}
		
		if(process != 4) {
		System.out.println("Çıkmak için 4'e basınız.");
		System.out.println("Devam etmek için 4 hariç herhangi bir tuşa basınız.");
	    }
		
	    exit = number.nextInt();
		
	    if(exit!=4 && process != 4) {
	    System.out.println("İşlem istediğiniz sayıyı giriniz.");
		process = number.nextInt();}
		}
		
		
		
		int i=0;
		while(i<10) {
		System.out.print("***");
		i +=1;
		}
		
		System.out.println();
		
		int c = 12;
		String name = "Hi!";
		System.out.println("Carla" +" "+ c + " " +  name);
		
		
		
		
		
	}
}
