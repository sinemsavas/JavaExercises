class Denemeler{
	public static void main (String args[]) {
		String str1, str2;
		str1 = "hi there!";
		str2 = str1;
		
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		System.out.println("Same object? " + (str1 == str2));
		
		str2 = new String(str1);//create a new object
		
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		System.out.println("Same object? " + (str1 == str2));//aynı obje mi değil mi kontrolü
		System.out.println("Same value? " + str1.equals(str2));//stringleri value olarak kontrol etmek için .equals() fonksiyonu kullan.
		
	}
}