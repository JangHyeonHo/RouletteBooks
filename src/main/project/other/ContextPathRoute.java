package other;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

public class ContextPathRoute {
	
	//자동으로 파일 저장할 디렉토리 입력함
	public static String route(HttpServletRequest request, String directory) {
		return request.getSession().getServletContext().getRealPath("WEB-INF/") + directory;
	}
	//디렉토리가 없으면 디렉토리를 만들어줌
	public static void createDirectory(File route) {
		if(!route.exists()) {
			route.mkdirs();
		}
	}
}
