package com.ofer.javacourse;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class StocksServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//variable declaration
		int num1=4;
		int num2=3;
		int num3=7;
		int result = (num1+num2)*num3;
		resp.setContentType("text/html");
		String resultStr = new String("<h1>Result of ("+num1+"+"+num2+")*"+num3+"="+result+"</h1>");
		resp.getWriter().println(resultStr);
	//	resp.getWriter().println("Hello, world");
	}
}
