<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>
	<section class="dashboard">
		<div class="header">
		<%
		HttpSession session1 = request.getSession();
		String username = (String) session1.getAttribute("name");
		%>
			<h2> Welcome <%= username %> </h2>
		</div>
		<div class="table">
			<h2>List of Users</h2>
			<table>
				<thead>
				<tr>
					<td>User Id</td>
					<td>User Name</td>
					<td>Role</td>
				</tr>
				</thead>
				<tbody>
			<%	Class.forName("com.mysql.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database1","root","4321");
				//HttpSession sessio = request.getSession();
				//String id = (String) sessio.getAttribute("id");	
				String query="select * from projectuser";
				try
				{
					
					Statement stm=con.createStatement();	
				    ResultSet rs=stm.executeQuery(query);	
								    while(rs.next())
								    {
											 %>				       			
					       				<tr>
												<td><%= rs.getString(1) %></td>
												<td><%= rs.getString(2) %></td>
												<td><%= rs.getString(3) %></td>
										</tr>
				       				  
					       				<%
		    	
			   						 } 
				                  %>
				                    <% 
									
								}
								catch(Exception p)
								{
									System.out.println(p);
								}	
									
							%> 		
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>