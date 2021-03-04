package test;
import java.io.*;
import javax.servlet.*;
public class HardOneServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		pw.println("<form action='answer111' method='post'>");
		pw.println("<center><h2>What is The output of following Question</h2></center>");
		pw.println("Find the odd man out.<br>Q.1 &nbsp&nbsp 3, 5, 11, 14, 17, 21 <br>");
		pw.println("A &nbsp&nbsp"+"<input type='submit' name='p111' value='7'/>");
		pw.println("B &nbsp&nbsp"+"<input type='submit' name='p111' value='21'/>");
		pw.println("C &nbsp&nbsp"+"<input type='submit' name='p111' value='14'/>");
		pw.println("D &nbsp&nbsp"+"<input type='submit' name='p111' value='3'/>");
		
		
		pw.println("</form>");
		
		 
	}

}
