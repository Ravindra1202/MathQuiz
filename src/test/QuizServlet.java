package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class QuizServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)throws 
	ServletException,IOException{
		String s1=req.getParameter("s1");
		if(s1.equals("Easy")){
			RequestDispatcher rd=req.getRequestDispatcher("easy");
			rd.forward(req, res);
		}
		if(s1.equals("Medium")){
			RequestDispatcher rd=req.getRequestDispatcher("medium");
			rd.forward(req, res);
		}
		if(s1.equals("Hard")){
			RequestDispatcher rd=req.getRequestDispatcher("hard");
			rd.forward(req, res);
		}
	}

}
