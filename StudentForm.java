package Web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		String formstr="<html>"
		+ "<body>"
		+ "<form action='Web2/StudentListServlet' method='GET'>"
		+ "Enter Student Name: <input type='text' name='name' />"
		+ "<br> Maths Marks: <input type='text' name='maths' />"
		+ "<br> Science Marks: <input type='text' name='science' />"
		+ "<br> ICT Marks: <input type='text' name='ict' />"
		+ "<input type='submit'/>"
		+ "</form>"
		+ "</body>"
		+ "</html>";
		PrintWriter out=resp.getWriter();
		out.print(formstr);
		out.close();
		
		
	}
	

}
