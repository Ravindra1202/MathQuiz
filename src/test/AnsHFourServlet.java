package test;
import java.io.*;
import javax.servlet.*;
public class AnsHFourServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p411");
		ServletContext sum=getServletContext();
		if(s.equals("12")){
			pw.println(s);
		}
			RequestDispatcher rd=req.getRequestDispatcher("question511");
			rd.forward(req, res);
	 	
	}

}
