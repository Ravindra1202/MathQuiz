package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class MediumDone extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res) throws 
	ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p51");
		if(s.equals("0.06")){
			pw.println("Correct Answer....!!");
		}
		else{
			pw.println("OOPS Wrong Answer");
		}
		 		pw.println("<br><br>");
		pw.println("<center><h1>Congrats You have Completed Quiz </h1></center>");
	}

}
