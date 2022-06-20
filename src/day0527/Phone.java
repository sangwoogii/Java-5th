package day0527;

public class Phone {

	String name;
	String spec;
	int cost;
	
	Phone() {}
	
	Phone(String name, String spec, int cost) {
		this.name = name;
		this.spec = spec;
		this.cost = cost;
	}
	
	void PhoneInfo() {
		
		System.out.println("모델명 : " + name);
		System.out.println("스펙 : " + spec);
		System.out.println("가격 : " + cost);
	}
}
