### **Contents of the Application**
* Java EE perspective
* Servlet classes
* HTML pages
* web.xml configurations
* Annotations - WebServlet
* JSP - Java Server Pages
* Sessions, Cookies, URL redirects
* IDEs 
	- Eclipse
	- Netbeans

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
* Session management implements
	- Session
	- Cookies
	- URL Redirecting
* HttpSession Cookies
* ServletConfig interface
	- shared buy all servlets
	- <context-param>
* ServletContext interface
	- limited to specific servlets
	- <init-param>
* Annotations
	- to configure servlets 
	
### **JSP**
* to allow writing of java code in html
* it is converted to a servlet when run
* Scriptlet tag 
	- `<% ... %>` 
	- _For content within a Servlet method_
* Declaration tag
	- `<%! ... %>`
	- _For defining instance variables_
* Directive tag
	- `<%@page .., ... %>` tag 
	- @page
		- `attribute="value"`
		- language, import, extends, session, autoFlush, contentType, errorPage, isErrorPage, info, isELIgnored, isThreadSafe ...
	- @include
		- import another jsp file
	- @taglib
		- to use external tags
		uri and prefix
	- _For imports_
* Expression tag
	- `<%=k ... %>`
	- _To print something_
* Implicit object
	- request (HttpServletRequest)
	- session (HttpSession)
	- out (JspWritter)
	- pageContext (PageContext)
	- response (HttpServletResponse)
	- application (ServletContext)
	- servlet (ServletConfig)
