//subclass ve ona ait özellikler
//overriding
//Final methods can not be overridden : If we don’t want a method to be overridden, we declare it as final.
//Static methods can not be overridden
//Private methods can not be overridden 
public class Managers extends Employees{
	
	private int sorumlu;
	public Managers(String name, int salary, int id, int sorumlu) {
		
		super(name,salary,id);//super ile  superclassın constructorına eriştim.
		this.sorumlu = sorumlu;

	}
	/*public void printFunc2() {
		System.out.println("Sorumlu olduğu kişi sayısı: " + this.sorumlu);
	}*/
	
	//override
	public void printFunc() {
	super.printFunc();
	System.out.println("Sorumlu olduğu kişi sayısı: " + this.sorumlu);
		
	}

	@Override
	public String toString() {
		return ("Manager sınıfımın çıktısı..");//Obje sınıfından aldığım methodu override ederek değiştirdim.
		//yeni çıktı: Manager sınıfımın çıktısı..
	}
	

	

}
