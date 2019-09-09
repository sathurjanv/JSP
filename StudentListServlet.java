package Web2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.tools.javac.util.List;

public class StudentListServlet extends HttpServlet {

	
	List<Student> stulist= new ArrayList<Student>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String studentname= req.getParameter("name");
		double marksmaths= Double.parseDouble(req.getParameter("maths"));
		double marksscience=Double.parseDouble(req.getParameter("science"));
		double marksict=Double.parseDouble(req.getParameter("ict"));
		
		
		
		
		Student student=new Student(studentname, marksmaths,marksscience, marksict );
		stulist.add(student);
		
		
		System.out.println(stulist);
		
		
		
		
		PrintWriter out=resp.getWriter();
		
		String rowstr="";
		for(Student studentrow: stulist) {
			rowstr= rowstr+ "<tr><td>"+ studentrow.getStudentName()+ "</td>"+
					"<td>" + studentrow.getmarksmaths()+ "</td>"+
					"<td>" + studentrow.getmarksscience()+ "</td>"+
					"<td>" + studentrow.getmarksict()+ "</td>"+
					"<td>" + studentrow.getmarksTotal()+ "</td>"+
					"<td>" + studentrow.getmarksAverage()+ "</td>"+
					"</tr>"
		}
		
		String tablehtml="<html>"+ "<body>"+ "table bordeer=1>" + "<tr>"+ <th> Student Name</th>"
		
		out.print(studentname);
	}
	

}
