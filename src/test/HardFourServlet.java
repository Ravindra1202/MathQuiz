package test;
import java.io.*;
import javax.servlet.*;
public class HardFourServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p311");
		if(s.equals("15 days")){
			pw.println("Correct Answer....!!");
		}
		else{
			pw.println("OOPS Wrong Answer");
		}
		pw.println("<form action='answer411' method='post'>");
		pw.println("<center><h2>What is The output of following Question</h2></center>");
		pw.println("<br>Q.4 &nbsp&nbsp 3 pumps, working 8 hours a day, can empty a tank in 2 days. How many "
				+ "hours a day must 4 pumps work to empty the tank in 1 day?"+"<br>");
		pw.println("A &nbsp&nbsp"+"<input type='submit' name='p411' value='9'/>");
		pw.println("B &nbsp&nbsp"+"<input type='submit' name='p411' value='10'/>");
		pw.println("C &nbsp&nbsp"+"<input type='submit' name='p411' value='11'/>");
		pw.println("D &nbsp&nbsp"+"<input type='submit' name='p411' value='12'/>");
		pw.println("</form>");
	}	

}
