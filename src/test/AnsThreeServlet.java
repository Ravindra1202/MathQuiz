package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AnsThreeServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p3");
		ServletContext sum=getServletContext();
		if(s.equals("15 days")){
			pw.println(sum);
		}
			RequestDispatcher rd=req.getRequestDispatcher("question4");
			rd.forward(req, res);
		 	
	}

}
