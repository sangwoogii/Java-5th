package day0527;

class Parent {
	int x = 10;
}

class Child extends Parent {
//	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
		// 상속받은 Child클래스는 x = 20;이라는 값과
		// Parent 클래스에서 상속받은 int x = 10;의 값을 가지게 되는데
		// int x = 10; 과 int x = 20;은 같은 것이 아닌 각각의 하나의
		// 이름을 가진 변수라고 생각하면된다.
	}
}


public class SuperVar1 {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.method();
	}

}
