package test;
import java.io.*;
import javax.servlet.*;
public class AnsHFiveServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p411");
		//ServletContext sum=getServletContext();
		 
			RequestDispatcher rd=req.getRequestDispatcher("done11");
			rd.forward(req, res);
}

}
