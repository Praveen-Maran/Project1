

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Checking
 */
@WebServlet("/Checking")
public class Checking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	                	request.setAttribute("name", username);
	                	response.sendRedirect("dashboard.jsp");	            		
	                }else{
	                	PrintWriter out = response.getWriter();
	                	out.println("<script type=\"text/javascript\">");
	 				   out.println("alert('Username or password is incorrect');");
	 				   out.println("location='login.html';");
	 				   out.println("</script>");
	                }
	            }
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       
	}
	

}
