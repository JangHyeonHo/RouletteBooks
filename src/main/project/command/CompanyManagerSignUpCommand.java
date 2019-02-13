package command;

import org.springframework.web.multipart.MultipartFile;

import other.AutoLinePrint;

public class CompanyManagerSignUpCommand implements CommandTestInterface {
	private MultipartFile staffPhoto;
	private String staffName;
	private String staffPw;
	private String staffPwConfirm;
	private String position;
	private String department;
	private String phone1;
	private String phone2;
	private String phone3;
	public MultipartFile getStaffPhoto() {
		return staffPhoto;
	}
	public void setStaffPhoto(MultipartFile staffPhoto) {
		this.staffPhoto = staffPhoto;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffPw() {
		return staffPw;
	}
	public void setStaffPw(String staffPw) {
		this.staffPw = staffPw;
	}
	public String getStaffPwConfirm() {
		return staffPwConfirm;
	}
	public void setStaffPwConfirm(String staffPwConfirm) {
		this.staffPwConfirm = staffPwConfirm;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
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
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("커멘드 객체 테스트","사원 이름 : " + staffName,"사원 비밀번호 : " + staffPw,
				"사원 비밀번호 재작성 : " + staffPwConfirm,"사원 직책 : " + position,"사원 부서 : " + department
				,"사원 전화번호 : " + phone1+phone2+phone3,"사원 사진 파일 : " + staffPhoto.getOriginalFilename());
	}
	//전화번호
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return (phone1+phone2+phone3);
	}
	
	
}
