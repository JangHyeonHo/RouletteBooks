package other;

/**
 *자동으로 System.out.println() 앞 뒤로 선을 만들어주는 클래스<br>
 *println(내용), println(내용들) 2개로 구성되어 있음.
 *@author 장현호
 *@version 1.0
 */
public class AutoLinePrint {
	
	/**
	 * System.out.println 앞 뒤로<br>
	 * ==================================================<br>
	 * 이 정도 길이의 선을 만들어줌<br>
	 * ==================================================<br>
	 * 
	 * @param arg 선과 선 사이에 들어갈 내용
	 */
	public static void println(String arg) {
		System.out.println("==================================================");
		System.out.println(arg);
		System.out.println("==================================================");
	}
	
	/**
	 * System.out.println 앞 뒤로<br>
	 * ==================================================<br>
	 * 이 정도 길이의 선을 만들어줌<br>
	 * ,를 넣어서 여러개 입력함으로써 개수만큼 만들어줌<br>
	 * ==================================================<br>
	 * 
	 * @param arg 선과 선 사이에 들어갈 내용들
	 */
	public static void println(String... arg) {
		System.out.println("==================================================");
		for(int i = 0; i<arg.length; i++) {
			System.out.println(arg[i]);
		}
		System.out.println("==================================================");
	}
}
