//gövdesiz methodları içinde barındırır.
//mainde obje oluşturamayız(soyut çünkü zort)
//onun yerine inheritance kullanıp, altsınıflarında obje tanımlayıp, onun referansını kullanırız.
//main2ye bak
//ortak olan methodlarımız varsa bunları abstract classlarda ortak olarak yazarız, farklı olacak olan varsa bunları da abstract method olarak yazabiliriz.
public abstract class AbstractClass {//kullanılamaz, kullanılması için başka class tarafından inherit edilmeli(kısıtlı)
	//gövdeli
	public void add() {
		System.out.println("Eklendi..");
	}
	public void delete() {
		System.out.println("Silindi..");
	}
	
	//gövdesiz method/no body, body provided by the subclass.
	abstract void update();
	abstract void get();
}
