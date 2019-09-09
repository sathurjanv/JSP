package Web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addform extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		String formstr="<html>"
		+ "<body>"
		+ "<form action='Web2/AddNumber' method='GET'>"
		+ "Enter Number 1: <input type='text' name='num1' />"
		+ "Enter Number 2: <input type='text' name='num2' />"
		+ "<input type='submit'/>"
		+ "</form>"
		+ "</body>"
		+ "</html>";
		
		
//		String num1= req.getParameter("num1");
//		String num2=req.getParameter("num2");
//		
//		int n1=Integer.parseInt(num1);
//		int n2=Integer.parseInt(num2);
//		int ans=n1+n2;
		
		PrintWriter out=resp.getWriter();
		out.print(formstr);
		out.close();
	}
	
	

}
