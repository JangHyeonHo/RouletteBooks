package other;

import javax.servlet.http.HttpServletRequest;

public class ContextPathRoute {
	
	public static String route(HttpServletRequest request, String directory) {
		return request.getSession().getServletContext().getRealPath("WEB-INF/view/") + directory;
	}
}
