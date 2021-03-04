package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AnsMFiveServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p41");
		//ServletContext sum=getServletContext();
		 
			RequestDispatcher rd=req.getRequestDispatcher("done1");
			rd.forward(req, res);
}

}
