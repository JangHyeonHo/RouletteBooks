package dto;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class RMember implements DTOTestInterface {
	//회원 정보 테이블
	String mNo; //회원 번호
	String mEmail; //회원 이메일
	String mPhone; //회원 전화번호
	String mName; //회원 이름
	String mPassword; //회원 비밀번호
	String mNickname; //회원 닉네임
	Date mBirthDate; //회원 생년월일
	String mGender; //회원 성별
	String mGrade; //회원 등급
	Date mCreDate; //회원 생성일
	int mCash; //회원 예치금
	String mAddress; //회원 주소
	String mAccNum; //회원 계좌번호
	String mAccBank; //회원 계좌 은행명
	String mStatus; //회원 상태
	
	//Getter Setter
	public String getmNo() {
		return mNo;
	}
	public RMember setmNo(String mNo) {
		this.mNo = mNo;
		return this;
	}
	public String getmEmail() {
		return mEmail;
	}
	public RMember setmEmail(String mEmail) {
		this.mEmail = mEmail;
		return this;
	}
	public String getmPhone() {
		return mPhone;
	}
	public RMember setmPhone(String mPhone) {
		this.mPhone = mPhone;
		return this;
	}
	public String getmName() {
		return mName;
	}
	public RMember setmName(String mName) {
		this.mName = mName;
		return this;
	}
	public String getmPassword() {
		return mPassword;
	}
	public RMember setmPassword(String mPassword) {
		this.mPassword = mPassword;
		return this;
	}
	public String getmNickname() {
		return mNickname;
	}
	public RMember setmNickname(String mNickname) {
		this.mNickname = mNickname;
		return this;
	}
	public Date getmBirthDate() {
		return mBirthDate;
	}
	public RMember setmBirthDate(Date mBirthDate) {
		this.mBirthDate = mBirthDate;
		return this;
	}
	public String getmGender() {
		return mGender;
	}
	public RMember setmGender(String mGender) {
		this.mGender = mGender;
		return this;
	}
	public String getmGrade() {
		return mGrade;
	}
	public RMember setmGrade(String mGrade) {
		this.mGrade = mGrade;
		return this;
	}
	public Date getmCreDate() {
		return mCreDate;
	}
	public RMember setmCreDate(Date mCreDate) {
		this.mCreDate = mCreDate;
		return this;
	}
	public int getmCash() {
		return mCash;
	}
	public RMember setmCash(int mCash) {
		this.mCash = mCash;
		return this;
	}
	public String getmAddress() {
		return mAddress;
	}
	public RMember setmAddress(String mAddress) {
		this.mAddress = mAddress;
		return this;
	}
	public String getmAccNum() {
		return mAccNum;
	}
	public RMember setmAccNum(String mAccNum) {
		this.mAccNum = mAccNum;
		return this;
	}
	public String getmAccBank() {
		return mAccBank;
	}
	public RMember setmAccBank(String mAccBank) {
		this.mAccBank = mAccBank;
		return this;
	}
	public String getmStatus() {
		return mStatus;
	}
	public RMember setmStatus(String mStatus) {
		this.mStatus = mStatus;
		return this;
	}
	
	//비밀번호 암호화
	public String PasswordMD5(String password) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte[] byteData = md.digest();
			StringBuffer strBuf = new StringBuffer();
			for(byte b : byteData) {
				password = strBuf.append(Integer.toString((b&0xff) + 0x100, 16).substring(1)).toString();
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("비밀번호 암호화완료 : " + password);
		return password;
	}
	
	//모델에 제대로 들어갔는지 테스트
	@Override
	public void DTOTEST() {
		System.out.println("회원 DTO 정보 확인");
		System.out.println("회원 번호 : " + mNo);
		System.out.println("회원 이메일" + mEmail);
		System.out.println("회원 전화번호 : " + mPhone);
		System.out.println("회원 이름" + mName);
		System.out.println("회원 비밀번호 : " + mPassword);
		System.out.println("회원 닉네임" + mNickname);
		System.out.println("회원 생년월일 : " + mBirthDate);
		System.out.println("회원 성별" + mGender);
		System.out.println("회원 등급 : " + mGrade);
		System.out.println("회원 생성일" + mCreDate);
		System.out.println("회원 예치금 : " + mCash);
		System.out.println("회원 주소" + mAddress);
		System.out.println("회원 계좌 번호 : " + mAccNum);
		System.out.println("회원 계좌 은행명" + mAccBank);
		System.out.println("회원 상태" + mAccBank);
		System.out.println("이상 완료=============================================");
	}
	
}


