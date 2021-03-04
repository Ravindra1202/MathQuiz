package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class AnsSecServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p2");
		ServletContext sum=getServletContext();
		if(s.equals("700 apples")){
			pw.println(sum);
		}
			RequestDispatcher rd=req.getRequestDispatcher("question3");
			rd.forward(req, res);
		
	}
}
