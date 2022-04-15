package com.theo.add;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add") // using annotations
public class AddServlet extends HttpServlet {
	//	work with post or get method
	/*
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int result = a + b;
		System.out.println("Result: " + result);
		
		PrintWriter outObj =  res.getWriter();
		outObj.println("Result: " + result);
	}
	*/
	// only work with post request
	/*
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int result = a + b;
		System.out.println("Result: " + result);
		
		PrintWriter outObj =  res.getWriter();
		outObj.println("Result: " + result);
	}
	*/
	// only work with get request
	/*
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int result = a + b;
		
		// to print result in console
		System.out.println("Result: " + result);
		
		// to print result on browser
		PrintWriter outObj =  res.getWriter();
		outObj.println("Result: " + result);
		
		// to send to a servlet on same domain
		
		// session management to share data between servlets
		req.setAttribute("valueToPass", result);
		
		// call a servlet using either req dispatcher or redirect
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("sq");
		requestDispatcher.forward(req, res);
		
		// to send to a servlet on different domain and pass a value
		
		// URL redirect
		res.sendRedirect("sq?valueToPass="+result);
		
		// Sessions
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("valueToPass", result);
		
		// session redirect
		res.sendRedirect("sq");
		
		// Cookies
		Cookie cookie = new Cookie("valueToPass", result + ""); 	// param as string
		res.addCookie(cookie);
		
		// cookie redirect
		res.sendRedirect("sq");

	} 
	
	// access xml file configurations
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter outObj =  res.getWriter();
		outObj.println("Hi");
		
		// get xml gloabal values
		ServletContext servletContext = getServletContext();
		String name = servletContext.getInitParameter("name");
		outObj.println(name);
		
		// get xml local values
		ServletConfig servletConfig = getServletConfig();
		String name = servletConfig.getInitParameter("name");
		outObj.println(name);
		
	}
	*/
	// use annotations instead of xml file
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter outObj =  res.getWriter();
		
		
	}
}
