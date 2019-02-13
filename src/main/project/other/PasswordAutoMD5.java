package other;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordAutoMD5 {
	
	//자동 비밀번호 암호화 class
	//사용방식은 static이므로 PasswordAutoMD5.passwordChange(비밀번호)로 암호화 가능.
	public static String passwordChange(String password) {
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
		
		AutoLinePrint.println("비밀번호 암호화 : " + password);
		
		return password;
	}
}
