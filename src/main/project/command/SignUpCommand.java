package command;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SignUpCommand {
	//회원가입 커맨드 객체;
	
	private String email;
	private String password;
	private String passwordCon;
	private String nick;
	private String name;
	private String year;
	private String month;
	private String day;
	private String sex;
	private String address;
	private String address1;
	private String phoneFirst;
	private String phone2;
	private String phone3;
	private String bankName;
	private String accountNum;
	
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
	public String getPasswordCon() {
		return passwordCon;
	}
	public void setPasswordCon(String passwordCon) {
		this.passwordCon = passwordCon;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getPhoneFirst() {
		return phoneFirst;
	}
	public void setPhoneFirst(String phoneFirst) {
		this.phoneFirst = phoneFirst;
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
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public void CommandTest() {
		System.out.println("커맨드 객체 테스트");
		System.out.println("email : " + email);
		System.out.println("password : " + password);
		System.out.println("password확인 : " + passwordCon);
		System.out.println("nickname : " + nick);
		System.out.println("name : " + name);
		System.out.println("birth day : " + year+"-"+month+"-"+day);
		System.out.println("gender : " + sex);
		System.out.println("address : " + address + " " + address1);
		System.out.println("phone : " + phoneFirst+"-"+phone2+"-"+phone3);
		System.out.println("bankName : " + bankName);
		System.out.println("accountNum : " + accountNum);
		System.out.println("이상 완료 =========================================================");
	}
	//받아온 폰 번호 합치기
	public String getPhoneNumber() {
		// TODO Auto-generated method stub
		return (phoneFirst+"-"+phone2+"-"+phone3);
	}
	//받아온 주소 합치기
	public String getFullAddress() {
		// TODO Auto-generated method stub
		return (address + " " + address1);
	}
	//받아온 생년월일 합치기
	public Date getFullBirthDate() {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse((year+"-"+(month.length()==1?"0"+month:month)+"-"+(day.length()==1?"0"+day:day)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
