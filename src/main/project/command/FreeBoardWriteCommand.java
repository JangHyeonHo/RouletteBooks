package command;

public class FreeBoardWriteCommand implements CommandTestInterface {

	private String mNo;
	private String subject;
	private String content;
	
	public String getmNo() {
		return mNo;
	}

	public void setmNo(String mNo) {
		this.mNo = mNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		System.out.println("커멘드 객체 테스트");
		System.out.println("회원번호 : " + mNo);
		System.out.println("제목 : " + subject);
		System.out.println("내용 : " + content);
		System.out.println("=======================================");

	}

}
