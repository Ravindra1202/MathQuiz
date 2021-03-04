package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class EasySecServlet extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p1");
		if(s.equals("14")){
			pw.println("Correct Answer....!!");
		}
		else{
			pw.println("OOPS Wrong Answer");
		}
		
		pw.println("<form action='answer2' method='post'>");
		pw.println("<center><h2>What is The output of following Question</h2></center>");
		pw.println("<br>Q.2 &nbsp&nbsp A fruit seller had some apples. He sells 40% apples"
				+ " and still has 420 apples. Originally he had:"+"<br>");
		pw.println("A &nbsp&nbsp"+"<input type='submit' name='p2' value='588 apples'/>");
		pw.println("B &nbsp&nbsp"+"<input type='submit' name='p2' value='600 apples'/>");
		pw.println("C &nbsp&nbsp"+"<input type='submit' name='p2' value='672 apples'/>");
		pw.println("D &nbsp&nbsp"+"<input type='submit' name='p2' value='700 apples'/>");
		pw.println("</form>");
		
	 	
	}
}
