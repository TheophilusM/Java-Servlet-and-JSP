package com.theo.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int result = a + b;
		System.out.println("Result: " + result);
		
		PrintWriter outObj =  res.getWriter();
		outObj.println("Result: " + result);
	}
}
