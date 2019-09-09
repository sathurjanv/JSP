package Web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		
		
		String num1= req.getParameter("num1");
		String num2=req.getParameter("num2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		
		
		
		String operations= req.getParameter("operate");
		
		//private static void Calculation(String operations) {
		
//			String current = args[0];
//			String operations = String.valueOf(current);
//			String value = null;
	
		
		switch(operations){
		   case "sum":
			   int ans=n1+n2;
			   PrintWriter out= resp.getWriter();
			   out.println("Answer is:" +ans);
			break;
		   case "sub":
			    ans=n1-n2;
			   PrintWriter out2=  resp.getWriter();
			   out2.println("Answer is:" +ans);
			break;
		   case "mult":
			    ans=n1*n2;
			   PrintWriter out3=  resp.getWriter();
			   out3.println("Answer is:" +ans);
			break;
		   case "div":
			    ans=n1/n2;
			   PrintWriter out4=  resp.getWriter();
			   out4.println("Answer is:" +ans);
			break;
			
			default:
			
		
		
	}
	}

}
