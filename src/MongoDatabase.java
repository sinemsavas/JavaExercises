//abstract classın subclassı
public class MongoDatabase extends AbstractClass{

	@Override
	void update() {
		System.out.println("Mongo Güncelledi..");
		
	}

	@Override
	void get() {
		System.out.println("Mongo verileri aldı..");
		
	}
	

}
