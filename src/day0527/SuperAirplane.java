package day0527;

class Airplane {
	public void takeOff() { // Airplane클래스에선 메서드만 생성
		System.out.println("이륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void land() {
		System.out.println("착륙합니다.");
	}
}



class Supersonic extends Airplane { // Airplane클래스를 상속받는 클래스 생성
	public static final int NORMAL = 1;
	// 상수로 변수를 설정할 땐 변수명을 무조건 대문자로 설정
	
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	public void fly() { // 오버라이딩
		if (flyMode == SUPERSONIC) {
			System.out.println("초고속 비행합니다.");
		} else {
			super.fly();
		}
	}
}



public class SuperAirplane {

	public static void main(String[] args) {

		// 화면에 나타날 순서
		// 이륙합니다.
		// 일반 비행합니다.
		// 초고속 비행 합니다.
		// 일반 비행 합니다.
		// 착륙합니다.
		
		Supersonic sa = new Supersonic();
		sa.takeOff();
		sa.fly();
		sa.flyMode = Supersonic.SUPERSONIC;
		sa.fly();
		sa.flyMode = sa.NORMAL;
		sa.fly();
		sa.land();

	}

}
