### **Contents of the Application**
* Java EE perspective
* Servlet classes
* HTML pages
* web.xml configurations

### **Java Servlet notes**
* Static vs Dynamic request
* Methods
	- service()
	- doGet()
	- doPost()
	- doDelete()
* web.xml - routing requests to servlets
* servlet - process http requests
* web container
* JSP - Java Server Pages, with user data to be sent as an http response object
* Web containers
	- Apache Tomcat
	- GlassFish
	- IBM WebSphere
* Tomcat 
	- sent request to a servlet 
		- a special java class that extends HttpServlet
* web.xml 
	- file the servlet configurations
* annotation 
	- can be used in servlet for mapping and replaces xml
* Request object 
	- HttpServletRequest interface
* Response object 
	- HttpServletResponse interface
* Calling servlet from a servlet
	- RequestDispatcher to call another servlet
	- ResponseDispatcher to send response to the browser
	- **For servlets on different domains**
		- Servlet ask browser to redirect request
		- sendRedirect() methods used

	
	
	
	