package command;

public class PwSearchCommand {
	private String phonenumber1;
	private String phonenumber2;
	private String phonenumber3;
	
	
	public String getPhonenumber1() {
		return phonenumber1;
	}
	public void setPhonenumber1(String phonenumber1) {
		this.phonenumber1 = phonenumber1;
	}
	public String getPhonenumber2() {
		return phonenumber2;
	}
	public void setPhonenumber2(String phonenumber2) {
		this.phonenumber2 = phonenumber2;
	}
	public String getPhonenumber3() {
		return phonenumber3;
	}
	public void setPhonenumber3(String phonenumber3) {
		this.phonenumber3 = phonenumber3;
	}
	
	
	public void CommandTest() {
		// TODO Auto-generated method stub
		System.out.println("커멘드 객체 테스트");
		System.out.println("앞번호 : " + phonenumber1);
		System.out.println("중간번호 : " + phonenumber2);
		System.out.println("마지막번호 : " + phonenumber3);
		System.out.println("=======================================");

	}
}
