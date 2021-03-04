package test;
import java.io.*;
import javax.servlet.*;
public class AnsHOneServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String s=req.getParameter("p111");
		 
		if(s.equals("14")){
			pw.println(s);

		}
		RequestDispatcher rd=req.getRequestDispatcher("question211");
		rd.forward(req, res);
	}

}
