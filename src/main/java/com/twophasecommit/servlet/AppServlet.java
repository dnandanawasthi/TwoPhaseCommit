package com.twophasecommit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twophasecommit.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import com.twophasecommit.model.Course;
import com.twophasecommit.service.Service;

@Component("appServlet")
public class AppServlet 
implements HttpRequestHandler {

	static int id = 123;
	@Autowired
	private Service service;

	public void handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Course course = new Course();
		course.setId(id);
		course.setName("English");
		id++;
		University university = new University();
		university.setId(id);
		university.setName("Cambridge");
		id++;
		try {
			service.persistCourseNUniversity(course, university);
			 resp.setContentType("text/html");
		        PrintWriter out = resp.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Two Phse commit</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Two Phse commit</h1>");
		        out.println("<h2>Records inserted!</h2>");
		        out.println("</body>");
		        out.println("</html>");
		} catch (Exception e) {
			 resp.setContentType("text/html");
		        PrintWriter out = resp.getWriter();
		        out.println("<html>");
		        out.println("<head>");
		        out.println("<title>Two Phse commit</title>");
		        out.println("</head>");
		        out.println("<body>");
		        out.println("<h1>Two Phse commit</h1>");
		        out.println("<h2>Transaction Rollback!</h2>");
		        out.println("</body>");
		        out.println("</html>");
			e.printStackTrace();
		}
	}
}