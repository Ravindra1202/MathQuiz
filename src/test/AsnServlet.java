package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AsnServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p1");
		 
		if(s.equals("14")){
			pw.println(s);

		}
		RequestDispatcher rd=req.getRequestDispatcher("question2");
		rd.forward(req, res);
	}

}
