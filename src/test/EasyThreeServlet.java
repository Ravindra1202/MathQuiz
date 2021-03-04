package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class EasyThreeServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p2");
		if(s.equals("700 apples")){
			pw.println("Correct Answer....!!");
		}
		else{
			pw.println("OOPS Wrong Answer");
		}
		pw.println("<form action='answer3' method='post'>");
		pw.println("<center><h2>What is The output of following Question</h2></center>");
		pw.println("<br>Q.3 A, B and C can do a piece of work in 20, 30 and 60 days respectively."
				+ " In how many days can A do the work if he is assisted by B and C on every third day?"+"<br>");
		pw.println("A &nbsp&nbsp"+"<input type='submit' name='p3' value='12 days'/>");
		pw.println("B &nbsp&nbsp"+"<input type='submit' name='p3' value='15 days'/>");
		pw.println("C &nbsp&nbsp"+"<input type='submit' name='p3' value='16 days'/>");
		pw.println("D &nbsp&nbsp"+"<input type='submit' name='p3' value='18 days'/>");
		pw.println("</form>");

	}	
}
