package test;
import java.io.*;
import javax.servlet.*;
public class AnsHSecServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p211");
		ServletContext sum=getServletContext();
		if(s.equals("700 apples")){
			pw.println(sum);
		}
			RequestDispatcher rd=req.getRequestDispatcher("question311");
			rd.forward(req, res);
		
	}


}
