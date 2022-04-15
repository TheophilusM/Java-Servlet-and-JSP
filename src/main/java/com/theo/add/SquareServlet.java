package com.theo.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter outObj =  res.getWriter();
		outObj.println("Running another servlet");
		
		// access a passed attribute and cast object to required attribute
		int result = (int) req.getAttribute("valueToPass");
		
		int sqResult = result * result;
		System.out.println("Square Result: " + result);
	}
}
