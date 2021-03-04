package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AnsMFourServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p41");
		ServletContext sum=getServletContext();
		if(s.equals("12")){
			pw.println(s);
		}
			RequestDispatcher rd=req.getRequestDispatcher("question51");
			rd.forward(req, res);
	 	
	}

}
