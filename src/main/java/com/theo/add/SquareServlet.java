package com.theo.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter outObj =  res.getWriter();
		
		/*
		HttpSession httpSession = req.getSession();
		outObj.println("Running another servlet");
		System.out.println("Running another servlet");
		outObj.println();
		
		// access a passed attribute and cast object to required attribute
		int result = (int) req.getAttribute("valueToPass");
		
		int sqResult = result * result;
		outObj.println("Square Result: " + sqResult);
		
		// get parameter for url redirect
		int param = Integer.parseInt(req.getParameter("valueToPass"));
		outObj.println("Parameter: " + param);
		
		// get parameter for session
		int param = (int) httpSession.getAttribute("valueToPass");
		outObj.println("Session param: " + param);
		
		// can delete data from session using removeSession() method
		 */
		
		// using cookie array req
		int cookieValue = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie cookie : cookies) {
			if (cookie.getName() == "valueToPass") {
				cookieValue = Integer.parseInt(cookie.getValue());
				outObj.println("Cookie param: " + cookieValue);
			}
		}
	}
}
