package test;
import java.io.*;
import javax.servlet.*;
public class AnsHThreeServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p311");
		ServletContext sum=getServletContext();
		if(s.equals("15 days")){
			pw.println(sum);
		}
			RequestDispatcher rd=req.getRequestDispatcher("question411");
			rd.forward(req, res);
		 	
	}

}
