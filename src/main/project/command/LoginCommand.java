package command;

public class LoginCommand implements CommandTestInterface{
	private String email;
	private String password;
	private String loginmaintain;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginmaintain() {
		return loginmaintain;
	}
	public void setLoginmaintain(String loginmaintain) {
		this.loginmaintain = loginmaintain;
	}
	
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		System.out.println("커멘드 객체 테스트");
		System.out.println("이메일 : " + email);
		System.out.println("비밀번호 : " + password);
		System.out.println("로그인 자동완성 : " + loginmaintain);
		System.out.println("======================================");
	}
	
	
	
}
