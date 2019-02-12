package other;

public class AutoLinePrint {
	
	//자동으로 sysout에 선을 만들어주는 클래스
	//사용 방식은 AutoLinePrint.println(내용) -> 한 줄 짜리 or AutoLinePrint.println(내용, 내용, 내용, 내용) -> 여러줄 짜리
	public static void println(String arg) {
		System.out.println("==================================================");
		System.out.println(arg);
		System.out.println("==================================================");
	}
	
	public static void println(String... arg) {
		System.out.println("==================================================");
		for(int i = 0; i<arg.length; i++) {
			System.out.println(arg[i]);
		}
		System.out.println("==================================================");
	}
}
