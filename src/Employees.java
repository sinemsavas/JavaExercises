//superclass
public class Employees {
	private String name;
	private int salary;
	private int id;
	protected String fabrika = "Microsoft";

	public Employees(String name, int salary, int id ) {
		this.name = name;
		this.salary = salary;
		this.id = id;

	}
	
	public void printFunc() {
		System.out.println("Kullanıcı Bilgileri: ");
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("ID: " + this.id);
	}

}
