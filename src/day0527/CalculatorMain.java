package day0527;

class Calculator {
	static double pi = 3.14159; // 클래스 변수
	
	static int plus(int x, int y) { // 클래스 메서드
		return x + y;
	}
	
	static int minus(int x, int y) { // 클래스 메서드
		return x - y;
	}
	
	// static (클래스) 메서드는 return값이 필요함 
}

public class CalculatorMain {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * Calculator.pi;
		// 클래스는 객체생성없이 바로 사용가능 / 클래스 이름 붙이기
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
