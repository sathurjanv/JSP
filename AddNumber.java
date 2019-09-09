package Web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumber extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String num1= req.getParameter("num1");
		String num2=req.getParameter("num2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int ans=n1+n2;
		
		PrintWriter out=  resp.getWriter();
		out.println("Answer is:" +ans);
		
		//super.doGet(req, resp);
		
	
		
	}
	
	

}
