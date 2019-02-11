package other;

public class AutoLinePrint {
	
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
