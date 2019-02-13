package dto;

import java.io.File;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import command.CompanyManagerSignUpCommand;
import other.AutoFileClassfication;
import other.AutoLinePrint;
import other.ClassifiedFile;
import other.ContextPathRoute;
import other.PasswordAutoMD5;

public class RManager implements DTOTestInterface {

	private String rmno;
	private String rmname;
	private String rmphone;
	private Date rmbirthDate;
	private String rmImgOriginFile;
	private String rmImgStoreFile;
	private String rmgrade;
	private String rmpassword;
	private int rmsalary;
	private int rmcommission;
	private Date rmcreDate;
	private String rmdepartment;

	public String getRmno() {
		return rmno;
	}
	public RManager setRmno(String rmno) {
		this.rmno = rmno;
		return this;
	}
	public String getRmname() {
		return rmname;
	}
	public RManager setRmname(String rmname) {
		this.rmname = rmname;
		return this;
	}
	public String getRmphone() {
		return rmphone;
	}
	public RManager setRmphone(String rmphone) {
		this.rmphone = rmphone;
		return this;
	}
	public Date getRmbirthDate() {
		return rmbirthDate;
	}
	public RManager setRmbirthDate(Date rmbirthDate) {
		this.rmbirthDate = rmbirthDate;
		return this;
	}
	public String getRmImgOriginFile() {
		return rmImgOriginFile;
	}
	public RManager setRmImgOriginFile(String rmImgOriginFile) {
		this.rmImgOriginFile = rmImgOriginFile;
		return this;
	}
	public String getRmImgStoreFile() {
		return rmImgStoreFile;
	}
	public RManager setRmImgStoreFile(String rmImgStoreFile) {
		this.rmImgStoreFile = rmImgStoreFile;
		return this;
	}
	public String getRmgrade() {
		return rmgrade;
	}
	public RManager setRmgrade(String rmgrade) {
		this.rmgrade = rmgrade;
		return this;
	}
	public String getRmpassword() {
		return rmpassword;
	}
	public RManager setRmpassword(String rmpassword) {
		this.rmpassword = rmpassword;
		return this;
	}
	public int getRmsalary() {
		return rmsalary;
	}
	public RManager setRmsalary(int rmsalary) {
		this.rmsalary = rmsalary;
		return this;
	}
	public int getRmcommission() {
		return rmcommission;
	}
	public RManager setRmcommission(int rmcommission) {
		this.rmcommission = rmcommission;
		return this;
	}
	public Date getRmcreDate() {
		return rmcreDate;
	}
	public RManager setRmcreDate(Date rmcreDate) {
		this.rmcreDate = rmcreDate;
		return this;
	}
	public String getRmdepartment() {
		return rmdepartment;
	}
	public RManager setRmdepartment(String rmdepartment) {
		this.rmdepartment = rmdepartment;
		return this;
	}

	@Override	
	public void DTOTEST() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("사원 테스트","사원 번호 : " + rmno,"사원 이름 : " + rmname,
				"사원 전화번호 : " + rmphone,"사원 생년월일 : " + rmbirthDate,
				"사원 사진 원래 파일이름 : " + rmImgOriginFile,"사원 사진 저장된 파일이름 : " + rmImgStoreFile,
				"사원 등급 : " + rmgrade,"사원 비밀번호 : " + rmpassword,
				"사원 급여 : " + rmsalary,"사원 성과금 : " + rmcommission,
				"사원 입사일 : " + rmcreDate,"사원 부서 : " + rmdepartment);
	}
	public RManager commandChange(HttpServletRequest request, CompanyManagerSignUpCommand command) {
		rmname = command.getStaffName();
		rmphone = command.getPhoneNumber();
		rmpassword = PasswordAutoMD5.passwordChange(command.getStaffPw());
		rmsalary = 0;
		rmbirthDate = command.getFormatBirthDate();
		rmgrade = command.getPosition();
		rmcreDate = new Date();
		rmdepartment = command.getDepartment();
		
		ContextPathRoute.createDirectory(new File(ContextPathRoute.route(request, "company/manager/photo")));
		ClassifiedFile file = AutoFileClassfication.OnefileClassficationing(command.getStaffPhoto(),ContextPathRoute.route(request, "company/manager/photo"));
		
		return setFilesName(file);
	}
	public RManager setFilesName(ClassifiedFile file) {
		this.rmImgOriginFile = file.getFileOriginName();
		this.rmImgStoreFile = file.getFileStoreName();
		return this;
	}

}
