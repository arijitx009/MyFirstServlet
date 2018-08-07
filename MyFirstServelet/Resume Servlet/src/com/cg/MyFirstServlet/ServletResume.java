package com.cg.MyFirstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.pckgResume.Resume;



@WebServlet("/ServletResume")
public class ServletResume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

		
		
		
		
		
		
	
      
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Resume rm=new Resume(
				request.getParameter("firstname"),request.getParameter("lastname"),
				request.getParameter("gender"),request.getParameter("date"),
				request.getParameter("emailid"),request.getParameterValues("hobbies"),
				request.getParameterValues("skills"),request.getParameter("address"),
				request.getParameter("description"),request.getParameter("qualification"),
				request.getParameter("contact"));
		
	
	request.setAttribute("ResumeRequest", rm);
	
	RequestDispatcher rd=request.getRequestDispatcher("ResumeJSP.jsp");

	rd.forward(request, response);	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
