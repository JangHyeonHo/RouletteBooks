package command;

import other.AutoLinePrint;

public class ManagerLoginCommand implements CommandTestInterface {
	
	private String comId;
	private String comPw;
	
	public String getComId() {
		return comId;
	}
	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getComPw() {
		return comPw;
	}
	public void setComPw(String comPw) {
		this.comPw = comPw;
	}
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("사원 로그인 커멘드 테스트","사원 번호 : " + comId, "사원 비밀번호 : " + comPw);
	}

}
