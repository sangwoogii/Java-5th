package package2;

import package1.A;

class C extends A {
	// package1번에 있는 A의 클래스가 그냥 class만 있으면 default이기 때문에
	// package2번에 있는 C의 클래스가 상속이 되지 않음
	// 상속을 받고 싶으면 'import package1.A;' 이걸 작성하면 됨
	
	public void printMembers() {
		System.out.println(pub);	// 클래스 A를 기준으로 실행가능
		System.out.println(pro);	// 클래스 A를 기준으로 실행가능
//		System.out.println(def);	// 클래스 A를 기준으로 실행가능
//		System.out.println(pri);	// 클래스 A를 기준으로 실행가능
	}
}