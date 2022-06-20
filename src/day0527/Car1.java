package day0527;

public class Car1 {
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	
	public static void main(String[] args) {
	// static 안에서 인스턴스 변수는 객체를 생성해야함
	// static 메서드는 객체 생성이 필요없고 화면에 출력하려면
	// 클래스이름을 붙여야함
		
		Car1 mycar = new Car1();
		
		mycar.speed = 60;
		mycar.run();
	}
}
