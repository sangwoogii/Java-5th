package day0527;

public class Car {

	private int num;
	private double gas;
	
	public Car() { // 초기값 (기본값) 선언
		num = 0;
		gas = 0.0d;
		
		System.out.println("자동차를 만들었어요 !");
	}
	
	public Car(int num, double gas) { // 매개변수가 2개인 생성자 생성
		// 생성자는 출력값이 없어도 void를 사용하지 않음
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량번호를 " + num + ", 연료량을 " + gas + "(으)로 설정함");
	}
	
	public void SetCar(int num, double gas) { // 매개변수가 2개인 메서드 생성
		this.num = num;
		this.gas = gas;
		
		System.out.println("차량번호를 " + num + ", 연료량을 " + gas + "(으)로 변경함");
	}
	
	public void show() {
		System.out.println("차량번호는 " + num);
		System.out.println("연료량은 " + gas);
	}
}
