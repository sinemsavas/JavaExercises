import java.util.Scanner;

public class Ders10 {

	public static void main(String[] args) {
		//stringler == kullanılarak karşılaştırılamaz
		// (==) ve Equals() methodları'nın ikisi de farklı 2 değeri(value) karşılaştırmak için kullanılır. (==) operator'ü 2 nesneyi karşılaştırırken(obje kıyaslar), Equals() methodu nesnenin içerdiği string'i(value kıyaslar) karşılaştırır.
		//Kullanıcı adı girişi
		//uygulama: kullanıcı adı ve parola belirli olan bir sistemde,kullanıcı adı ve şifre alan ve if else yapısı ile bilgilerin doğru/yanlış olduğunu anlama
		// .equals() kullanımı
		String user_name = "Sinem";
		String user_password = "1234";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kullanıcı adı giriniz: ");
		String get_username = scan.nextLine();//kullanıcı adını almak için
		System.out.println("Şifre giriniz: ");
		String get_password = scan.nextLine();//şifreyi almak için
		
		
		if ((user_name.equals(get_username)) && (user_password.equals(get_password))) {
			System.out.println("User name and password is true");
	}
		else if (!(user_name.equals(get_username)) && (user_password.equals(get_password))) {
			System.out.println("User name is wrong");
			
		}
		else if((user_name.equals(get_username)) && !(user_password.equals(get_password))) {
			System.out.println("Password is wrong");

		}
		else {
			System.out.println("User name and password is wrong");
		}
}
}