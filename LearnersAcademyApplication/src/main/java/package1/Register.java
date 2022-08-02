package package1;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Register")
public class Register extends HttpServlet {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String role = request.getParameter("role");
		String classes = request.getParameter("classes");
		String subject = request.getParameter("subject");
		String teacher = request.getParameter("teacher");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into student values(NULL,?,?,?,?,?,?)");

			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, role);
			ps.setString(4, classes);
			ps.setString(5, subject);
			ps.setString(6, teacher);

			int i = ps.executeUpdate();
			if (i > 0)
				out.print("You are successfully registered...");
			System.out.println("register successfully.... ");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println(":)");
		}

		out.close();
	}

}