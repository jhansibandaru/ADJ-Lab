package servers;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.http.Cookie;


/**
 * Servlet implementation class InitParams
 */
public class InitParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ServletConfig cfg = null;
    public InitParams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init(ServletConfig config) {
    	cfg = config;
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie c[] = new Cookie[4];
		int i = 0;
		
		Enumeration enu = cfg.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String name = enu.nextElement().toString();
			String value = cfg.getInitParameter(name);
			c[i] = new Cookie(name,value);
			response.addCookie(c[i]);
			i++;
		}
//		out.println("<table>");
//		
//		for(int j = 0; j < c.length; j++) {
//			out.println("<tr>");
//			String name = c[j].getName();
//			String value = c[j].getValue();
//			out.println("<td>" + name + ":</td>");
//			out.println("<td>" + value + "</td>");
//			out.println("</tr>");
//		}
//		
//		out.println("</table>");
		//System.out.println(c);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("username");
		String pswd = request.getParameter("password");
		//System.out.println(name+" "+pswd);
		Cookie c[] = request.getCookies();
//		out.println("<table>");
//		
//		for(int j = 0; j < c.length; j++) {
//			out.println("<tr>");
//			String pname = c[j].getName();
//			String value = c[j].getValue();
//			out.println("<td>" + pname + ":</td>");
//			out.println("<td>" + value + "</td>");
//			out.println("</tr>");
//		}
		
//		out.println("</table>");
		//System.out.println(c.length);
		int flag = 0;
		for(Cookie x:c) {
			String cname = x.getName().toString();
			String cpswd = x.getValue().toString();
			System.out.println(cname+" "+cpswd);
			if(name.equals(cname) && pswd.equals(cpswd)) {
				System.out.println("HIII");
				out.println("<h1>Hello,"+cname+" Welcome to our page..!,You have logged in successfully.");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			out.println("Your are not an authenticated user.");
		}
	}
}
