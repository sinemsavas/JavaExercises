
public class Car {
	//Fields/Properties/attributes of objects
	private String color;
	private String model;
	private double engine;
	private int doors;
	
	
	
	public Car(String color, String model) {
		this(color, model, 0 ,0); //this methot kullanımı.
	}
	
	public Car() {
		/*this.color = "None";
		this.model = "None";
		this.engine = 0;
		this.doors = 0;*/
		this("None","None", 0, 0); //constructor içinde constructor kullanılmasını sağlayan this() methodu.
		
	}
	
	
	public Car(String color, String model, double engine, int doors) {//Car classının consturctor'ı
		this.color = color;
		this.model = model;
		this.engine = engine;
		this.doors = doors;
	}
	
	//getter and setter oluşturma:
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	
	//methot oluşturma ve kullanma:
	public void start() {
		System.out.println("Araba çalıştı..");
	}
	
	public void stop() {
		System.out.println("Araba durdu.. ");
	}
	
	//doors fonksiyonunu düzenleyelim
	public void setDoors(int doors) {//doors=parametre
		if(doors == 2 || doors ==4) {
		this.doors = doors;}
		else {
			System.out.println("Kapı sayısı 2 veya 4 olmalı.. ");
		}
	}
	public int getDoors() {
		return (this.doors);
	}
	
	public void Print() {
		System.out.println("Arabanın rengi: " + this.color);
		System.out.println("Arabanın modeli: " + this.model);
		System.out.println("Arabanın motoru: " + this.engine);
		System.out.println("Arabanın kapı sayısı: " + this.doors);
		
		//System.out.println(this.color);
		
	}
	
	
	
}
