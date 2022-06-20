package day0527;

public class Member {

	// 캡슐화를 하기 위해 앞에 private을 입력
	
	private String name;
	private String tel;
	private String address;
	
	Member () {}
	
	
	// 인스턴스 변수의 '값을 읽어오는' 메서드의 이름 : get변수이름 (게터)
	// 변수의 '값을 변경'하는 메서드의 이름 : set변수이름 (세터)
	// 세터 : void의 매개변수자리에 입력하고 this.입력
	
	// 게터, 세터는 필드 1개당 하나씩 써주는 것이 좋음, return 필요
	public String getName() { 
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public void printMember() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
