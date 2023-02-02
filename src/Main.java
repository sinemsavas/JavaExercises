
public class Main {
	public int x;
	final int y=22;//final tanımlanan field değiştirilemez. PI gibi düşün.
	
	public void Main() {//constructor: A special kind of method(function) that is responsible for creation a new object of the class
		x = 4;
	}
	public static void main(String[] args) {
		//getter/setterlar yerine constructor oluşuturusak:
		Car car1 = new Car("purple","toyota",1.2,2);//consturctor obje oluşturulduğu an çağırılır.
		car1.Print();
		
		for(int i=0; i<10; i++) {
		System.out.print("*");
		if(i==9) {
		System.out.print("*\n");
		 }
		}
		
		
		Car car2 = new Car();//default değerler için constructor.
		car2.Print();
		
		for(int i=0; i<10; i++) {
			System.out.print("*");
			if(i==9) {
			System.out.print("*\n");
			 }
			}
		Car car3 = new Car("Silver", "BMW");//Belli değerler için girdi, kalanlar için default değer veren constructor.
		car3.Print();
		
		
		
		
		/*private oluşturup getter ve setterlar atarsak:
		Car car1 = new Car();
		car1.setColor("purple");//değeri vermemizi sağlar
		System.out.println("Arabanın rengi: " + car1.getColor());//değeri almamızı sağlar
		
		car1.setModel("Toyota");
		System.out.println("Arabanın modeli " + car1.getModel());
		
		car1.setEngine(1234);
		System.out.println("Arabanın motoru: " + car1.getEngine());*/
		
		
		//getter ve setter olmadan, public diye tanımlarsak:
		//car1.color = "blue";
		/*car1.model = "BMW";
		car1.engine = 127.9;
		
		System.out.println("Arabanın rengi: " + car1.color);
		System.out.println("Arabanın modeli: " + car1.model);
		System.out.println("Arabanın motoru: " + car1.engine);*/
		
		//---------------------------------------------------------
		
		//bir takım denemeler..
		/*Main sinem = new Main();
		System.out.println("ben " + sinem.x);
		System.out.println("ben " + sinem.y + " yaşındayım.");
		//sinem.y = 99;
		sinem.x = 5;*/
		
	/*	car1.start();
		car1.stop();
		
		//if/else yapılı dolaylı methotlar
		car1.setDoors(3);
		System.out.println("Kapı sayısı: " + car1.getDoors());*/
		
		
		
		
	}

}
