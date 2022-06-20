package day0527;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.setName("김그린");
		m.setTel("010-1111-2222");
		m.setAddress("울산시 남구");
		m.printMember();
		
		System.out.println();
		
		String name = m.getName();
		String tel = m.getTel();
		String addr = m.getAddress();
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + addr);	
	}

}
