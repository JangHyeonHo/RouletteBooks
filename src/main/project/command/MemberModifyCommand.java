package command;

public class MemberModifyCommand {
	
	private String nick;		//닉네임
	private String address;		//주소
	private String address1;	//상세주소
	private String phoneFirst;	//폰 앞번호
	private String phone2;		//폰 중간번호
	private String phone3;		//폰 끝번호
	private String bankName;	//계좌은행
	private int accountNum;		//계좌번호
	
	
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getPhoneFirst() {
		return phoneFirst;
	}
	public void setPhoneFirst(String phoneFirst) {
		this.phoneFirst = phoneFirst;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	
	

}
