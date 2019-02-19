package command;

public class FreeBoardUpdateCommand {
	private String mNo;
	private String subject;
	private String content;
	
	
	public String getMNo() {
		return mNo;
	}
	public void setMNo(String mNo) {
		mNo = mNo;
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
	
	public void commandTast() {
		System.out.println(mNo);
		System.out.println(subject);
		System.out.println(content);
	}
}
