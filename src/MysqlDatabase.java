//abstract classın subclassı
public class MysqlDatabase extends AbstractClass{

	@Override
	void update() {
		System.out.println("Mysql Güncelledi..");
		
	}

	@Override
	void get() {
		System.out.println("Mysql verileri aldı..");
		
	}
	

}
