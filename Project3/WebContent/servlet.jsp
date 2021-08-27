<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
    <%@ page import="java.io.*"%>
    <%@ page import="javax.servlet.http.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
       String password = request.getParameter("password");      
      
       String query="select * from projectlogin where username=? AND password=?"; 		

	        
	        try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//Connection
	        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database1","root","4321")) {
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, username);
	            ps.setString(2, password);
	            try (ResultSet rs = ps.executeQuery()) {
	                if(rs.next()){		                
	                    HttpSession session1 = request.getSession();
	        			session1.setAttribute("name", username);
	                	response.sendRedirect("dashboard.jsp");	            		
	                }else{
	                	PrintWriter out1 = response.getWriter();
	                	out1.println("<script type=\"text/javascript\">");
	 				   out1.println("alert('Username or password is incorrect');");
	 				   out1.println("location='login.jsp';");
	 				   out1.println("</script>");
	                }
	            }
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}%>
</body>
</html>