
public class Ders16 {
	public static void main(String[] args) {
		//continue; döngünün kendisinden aşağıdaki satırlar çalışmadan başa döndürür.
		//break; döngüyü tamamen bitirir, döngüden çıkar
		//4 ve 7 dışındaki 1-10 arasındaki sayıları yaz
		//break-continue kullanımı
		
		int i = 1;
		while(i<=10){
			if(i == 4 || i == 7) {
				i++;
				continue;
				}
			System.out.println("i= " + i);
			i++;
			
			
		}
		
		
		
		
	}

}
