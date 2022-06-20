package package2;

import package1.A;

public class D {

	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.pub);	// 클래스 A를 기준으로 실행가능
//		System.out.println(a.pro);
//		// 에러. 같은 패키지, 다른패키지의 자손까지 가능, D는 A를 상속받지 않아서 에러 
//		System.out.println(a.def);	// 에러. default -> 같은 패키지에서만 가능
//		System.out.println(a.pri);	// 에러. private -> 같은 클래스에서만 가능

	}

}
