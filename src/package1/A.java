package package1;

public class A {

	// 필드 추가 (접근 제어자에 관한 필드)
	// 중요 외우기 !
	
	public int pub;          // 접근 제한이 없음
	protected int pro;       // 같은 패키지 + 다른패키지 자손까지 접근 가능
			  int def;		 // 같은 패키지 내에서만 접근 가능
	private int pri;		 // 같은 클래스에서만 접근 가능
	
	
	public void printMembers() {
		System.out.println(pub);	// 클래스 A를 기준으로 실행가능
		System.out.println(pro);	// 클래스 A를 기준으로 실행가능
		System.out.println(def);	// 클래스 A를 기준으로 실행가능
		System.out.println(pri);	// 클래스 A를 기준으로 실행가능
	}
}
