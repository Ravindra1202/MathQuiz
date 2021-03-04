package test;
import java.io.*;
import javax.servlet.*;
public class HardFiveServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p411");
		if(s.equals("12")){
			pw.println("Correct Answer....!!");
		}
		else{
			pw.println("OOPS Wrong Answer");
		}
		pw.println("<form action='answer511' method='post'>");
		pw.println("<center><h2>What is The output of following Question</h2></center>");
		pw.println("<br>Q.5 &nbsp&nbsp The cube root of .000216 is:"+"<br>");
		pw.println("A &nbsp&nbsp"+"<input type='submit' name='p511' value='0.6'/>");
		pw.println("B &nbsp&nbsp"+"<input type='submit' name='p511' value='0.06'/>");
		pw.println("C &nbsp&nbsp"+"<input type='submit' name='p511' value='0.77'/>");
		pw.println("D &nbsp&nbsp"+"<input type='submit' name='p511' value='0.87'/>");
		pw.println("</form>");
	}	


}
