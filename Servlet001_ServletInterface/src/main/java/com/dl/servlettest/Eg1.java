package com.dl.servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Eg1 implements Servlet{

	ServletConfig config;

	@Override
	public ServletConfig getServletConfig() {
	System.out.println("getServletConfig Method");
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo Method Invoked");
		return "getServletInfo";
	}

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init Method Invoked");
	}
	

	@Override
	public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
		
		// Set the content type to HTML
        response.setContentType("text/html");

        // Get a PrintWriter to write HTML response
        PrintWriter writer = response.getWriter();

        // Write an HTML img tag
        writer.println("<html><head><title>Image Example</title></head><body>");
        writer.println("<h1>Image Example</h1>");
        writer.println("<img src='https://www.w3schools.com/images/picture.jpg' alt='Sample Image'>");
        writer.println("</body></html>");
        
        System.out.println("service() Method Invoked");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy Method");
		
	}

}
