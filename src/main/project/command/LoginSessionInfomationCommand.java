package command;

public class LoginSessionInfomationCommand implements CommandTestInterface{
	//회원 기본 상태에 관한 커멘드(Session에 담을 기본 자료)
	private String mEmail; //회원 이메일
	private String mNickname; //회원 닉네임
	private int mCash; //회원 예치금
	private String mStatus; //회원 상태
	private String mGrade; //회원 등급
	
	
	public String getmGrade() {
		return mGrade;
	}
	public LoginSessionInfomationCommand setmGrade(String mGrade) {
		this.mGrade = mGrade;
		return this;
	}
	public String getmEmail() {
		return mEmail;
	}
	public LoginSessionInfomationCommand setmEmail(String mEmail) {
		this.mEmail = mEmail;
		return this;
	}
	public String getmNickname() {
		return mNickname;
	}
	public LoginSessionInfomationCommand setmNickname(String mNickname) {
		this.mNickname = mNickname;
		return this;
	}
	public int getmCash() {
		return mCash;
	}
	public LoginSessionInfomationCommand setmCash(int mCash) {
		this.mCash = mCash;
		return this;
	}
	public String getmStatus() {
		return mStatus;
	}
	public LoginSessionInfomationCommand setmStatus(String mStatus) {
		this.mStatus = mStatus;
		return this;
	}
	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		System.out.println("커멘드 객체 테스트");
		System.out.println("이메일 : " + mEmail);
		System.out.println("닉네임 : " + mNickname);
		System.out.println("예치금 : " + mCash);
		System.out.println("상태 : " + mStatus);
		System.out.println("회원등급 : " + mGrade);
		System.out.println("=======================================");
	}
	
	
}
