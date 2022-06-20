package day0527;

class Galaxy extends Phone {
	String name;
	String spec;
	int cost;
	
	Galaxy (String name, String spec, int cost) {
		super (name, spec, cost);
	}
}


class Iphone extends Phone {
	String name;
	String spec;
	int cost;
	
	Iphone (String name, String spec, int cost) {
		super (name, spec, cost);
	}
}



public class PhoneMain {

	public static void main(String[] args) {
		
		Galaxy g = new Galaxy("갤럭시 z플립", "6.7인치 Dynamic Amoled", 1500000);
		Iphone i = new Iphone("IPhone12Pro", "6.7인치 Super Letina", 1400000);
		
		g.PhoneInfo();
		
		System.out.println();
		
		i.PhoneInfo();

	}

}
