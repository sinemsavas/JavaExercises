//Polymorphism: Çok biçimlilik*, bir referansın alttaki diğer sınıflara referans olduğunda farklı çalışmasıdır
//bir referansın birden fazla şekilde çalışmasıdır./üst sınıfın referansını alt sınıflara eşitleyebiliyorum

public class Inheritance1 {
	
	public static void main(String[] args) {
		Employees emp = new Employees("Sinem" , 9188 , 22);
		emp.printFunc();
		
		Managers manObj = new Managers("Savaş", 1235, 23, 4);
		manObj.printFunc();//superclassından aldı.
		//man.printFunc2();//kendi classından kullandı.
		
		System.out.println(manObj.fabrika);
		
		System.out.println(manObj);//Managers@cac736f
		
		//üst sınıfın referansını alt sınıflara eşitleyebiliyorum
		Employees emp2 = new Managers("Savaş", 1235, 23, 4);
		emp2.printFunc();
		
		
	}

}
