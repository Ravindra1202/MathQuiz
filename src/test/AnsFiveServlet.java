package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AnsFiveServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p4");
		//ServletContext sum=getServletContext();
		 
			RequestDispatcher rd=req.getRequestDispatcher("done");
			rd.forward(req, res);
		 
}
}
