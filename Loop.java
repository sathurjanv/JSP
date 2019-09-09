package Web2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Loop extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String paramstr=req.getParameter("Number");
		int loopnum=Integer.parseInt(paramstr);
		PrintWriter out=resp.getWriter();
		
		for(int i=1; i<=loopnum; i++) {
			out.println(i);
			
			//super.doGet(req, resp);
		}
	}
	
	

}
