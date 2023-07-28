package com.example2;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
//import java.sql.*;

@SuppressWarnings("serial")

public class ConfigServlet extends HttpServlet
{
	ServletConfig con;
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		con=getServletConfig();//this method is access by "this"
		
		String image=con.getInitParameter("image");
		String driver=con.getInitParameter("driver");
		
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		out.print("<html><body background="+image+">");
		out.print(driver);
		out.print("</body></html>");
	}

}
