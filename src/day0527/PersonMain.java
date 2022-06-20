package day0527;

class Person {
	// 주민번호, 국적, 이름을 입력받고 싶다.
	
	// 상수로 설정하면 변경할 수 없음, 상수는 대문자로 설정
	// 상수는 값을 변경할 수 없기 때문에 초기값을 무조건 정해주어야함
	
	final String SSN;
	final String NATION = "Korea"; // 명시적 초기화
	String name;
	
	// 상수의 초기값을 주는 방법 중 하나는 생성자를 생성해서 this를 넣는 것
	public Person (String SSN, String name) {
		this.SSN = SSN;
		this.name = name;
	}
}


public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "김그린");

		System.out.println(p1.SSN);
		System.out.println(p1.NATION);
		System.out.println(p1.name);
		
//		상수로 설정해놓았기 때문에 변경 불가능
//		p1.NATION = "USA";
//		p1.SSN = "111111-8888888";
		
//		출력이 위에서부터 순서대로 이루어지기 때문에
//		system.out.println을 한번 더 써주어야 함
		p1.name = "이자바";
		System.out.println(p1.name);
	}

}
