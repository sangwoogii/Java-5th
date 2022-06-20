package package1;

public class B {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.pub);	// 클래스 A를 기준으로 실행가능
		System.out.println(a.pro);	// 클래스 A를 기준으로 실행가능
		System.out.println(a.def);	// 클래스 A를 기준으로 실행가능
//		System.out.println(a.pri);	// 에러. private -> 같은 클래스에서만 가능
									// A클래스가 아닌 B클래스이기 때문에
		
		

	}

}
