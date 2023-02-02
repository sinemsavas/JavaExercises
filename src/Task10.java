// string --> int Integer.parseInt()//stringin içinde "4" gibi integer tanımlandıysa kullanılır: String a = "4".
// int --> string Integer.valueOf()

	public class Task10{
		
		
		public static void main(String[] args) {
			System.out.println(args.length + " arguments were passed my program..");
			int max = Integer.parseInt(args[0]);
			int min = Integer.parseInt(args[0]);
			int i,sum =0;
			
			for(i =0; i<args.length; i++) {
				if(max<Integer.parseInt(args[i])) {
					max = Integer.parseInt(args[i]);
				}
				
					if(min>Integer.parseInt(args[i])) {
					min = Integer.parseInt(args[i]);
				}
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("max value is: " +max);
			System.out.println("min value is: " + min);
			double avarage = sum/args.length;
			System.out.println("arithmetic avarage is: " + avarage);
		}
	
	}