package day0527;

class Animal {
	
	// 동물의 수를 출력받고 싶음
	// 인스턴스 변수 (이름, 색깔, 나이) 입력받기
	// 생성자 생성
	
	String name;
	String color;
	int age;
	
	static int count = 0; // 시리얼 넘버
	// static으로 주는 이유 ?
	
	Animal (String name, String color, int age) {
		// 매개변수 3개인 생성자 생성
		this.name = name;
		this.color = color;
		this.age = age;
		
		++count;
	}
}


public class AnimalMain {

	public static void main(String[] args) {
		// 동물이름, 색깔, 나이를 생성자를 통해 입력받을 것임
		Animal a1 = new Animal("자기야", "흰색", 14);
		Animal a2 = new Animal("다람이", "갈색", 5);
		Animal a3 = new Animal("구찌", "회색", 7); // 추가
		
		
		

		// 지금까지 접수된 반려동물 수 : 2마리
		System.out.println("지금까지 접수된 반려동물 수 : " + Animal.count + "마리");
		// Animal.count라고 한 이유는 count가 클래스 변수이기때문
	}

}
