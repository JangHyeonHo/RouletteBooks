package command;

import other.AutoLinePrint;

public class ManagerSessionInfomationCommand implements CommandTestInterface{
	
	private String rmno;
	private String rmname;
	private String rmgrade;
	private String rmdepartment;
	public String getRmno() {
		return rmno;
	}
	public ManagerSessionInfomationCommand setRmno(String rmno) {
		this.rmno = rmno;
		return this;
	}
	public String getRmname() {
		return rmname;
	}
	public ManagerSessionInfomationCommand setRmname(String rmname) {
		this.rmname = rmname;
		return this;
	}
	public String getRmgrade() {
		return rmgrade;
	}
	public ManagerSessionInfomationCommand setRmgrade(String rmgrade) {
		this.rmgrade = rmgrade;
		return this;
	}
	public String getRmdepartment() {
		return rmdepartment;
	}
	public ManagerSessionInfomationCommand setRmdepartment(String rmdepartment) {
		this.rmdepartment = rmdepartment;
		return this;
	}
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("사원 로그인 정보 커멘드 테스트","사원 번호 : " + rmno,"사원 이름 : " + rmname,"사원 등급 : " + rmgrade,"사원 부서 : " + rmdepartment);
		
	}
	
	
}
