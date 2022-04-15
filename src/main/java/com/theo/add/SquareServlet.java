package com.theo.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter outObj =  res.getWriter();
		/*
		outObj.println("Running another servlet");
		System.out.println("Running another servlet");
		outObj.println();
		
		// access a passed attribute and cast object to required attribute
		int result = (int) req.getAttribute("valueToPass");
		
		int sqResult = result * result;
		outObj.println("Square Result: " + sqResult);
		*/
		
		// get parameter
		int param = Integer.parseInt(req.getParameter("valueToPass"));
		outObj.println("Parameter: " + param);
	}
}
