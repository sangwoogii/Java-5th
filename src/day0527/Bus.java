package day0527;

// 캡슐화에 대한 내용
public class Bus {

	private int num;
	private int count;
	
	Bus () {}
	
	
	public void setNumCount(int num, int count) {
		// private때문에 BusMain에서 b.num,b.count가 먹히지 않음
		// BusMain에서 사용하기 위해서 메서드를 하나 만들고
		// Bus의 필드값을 매개변수로 집어 넣고 조건을 쓰면 됨
		// 버스 탑승인원은 최소 0명부터 최대 45명으로 우리가 기본적으로
		// 알고 있기 때문에 아래처럼 if문을 써서 조건을 쓰면 된다.
		if (extracted(count)) {
			this.num = num;
			this.count = count;
			System.out.println("차량 번호 : " + num + ", 탑승인원 : " + count + "명으로 설정");
		} else {
			System.out.println(count + "는 올바른 인원이 아닙니다.");
		}
	}


	// alt + shift + m (count 조건
	private boolean extracted(int count) {
		return count >= 0 && count <= 45;
	}
	
	
	public void show () { // 결과값을 출력하는 show라는 메서드 생성
		System.out.println("차량 번호 : " + num);
		System.out.println("탑승 인원 : " + count);
	}
}
