package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class AnsMOneServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p11");
		 
		if(s.equals("14")){
			pw.println(s);

		}
		RequestDispatcher rd=req.getRequestDispatcher("question21");
		rd.forward(req, res);
	}

}
