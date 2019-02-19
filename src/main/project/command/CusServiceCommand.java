package command;

public class CusServiceCommand {
	

	private String emailid;		//이메일id
	private String emailpath;	//이메일 사이트
	private String kind;		//문의글 종류
	private String subject;		//문의글 제목
	private String content;		//문의글 내용
	private String phoneNum;	//문의글 폰번호설정(답변알림)
	private String mailAgree;	//이메일 이용동의
	private String inquirywriter_mno; //회원 등록번호 
	private String situation;
	
	

	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getEmailid() {
		return emailid;
	}
	public String getInquirywriter_mno() {
		return inquirywriter_mno;
	}
	public void setInquirywriter_mno(String inquirywriter_mno) {
		this.inquirywriter_mno = inquirywriter_mno;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getEmailpath() {
		return emailpath;
	}
	public void setEmailpath(String emailpath) {
		this.emailpath = emailpath;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}	
	
	public String getMailAgree() {
		return mailAgree;
	}
	public void setMailAgree(String mailAgree) {
		this.mailAgree = mailAgree;
	}
	public void CommandTest() {
		System.out.println("커맨드 객체 테스트");
		System.out.println("emailid : " + emailid);
		System.out.println("emailpath : " + emailpath);
		System.out.println("kind : " + kind);
		System.out.println("subject : " + subject);
		System.out.println("content : " + content);
		System.out.println("phoneNum : "+ phoneNum);
		System.out.println("MailAgree : " + mailAgree);
		System.out.println("이상 완료 =========================================================");
	}
	//받아온 이메일 합치기
	public String getEmailNumber() {
		
		return (emailid+"@"+emailpath);
		
	}

	
}
