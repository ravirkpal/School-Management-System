package package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/TeacherRecords")
public class TeacherRecords extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			int id = Integer.parseInt(request.getParameter("id"));
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

			PreparedStatement ps = con.prepareStatement("SELECT * FROM students.student WHERE id ="+id);
			ResultSet rs = ps.executeQuery();
			PrintWriter out = response.getWriter();
			out.print("Teachers Details");
			out.print(
					"<html><body><table border=1px><tr><th>id</th><th>firstname</th><th>lasttname</th><th>role</th><th>classes</th><th>subject</th><th>teachers</th>");
			while (rs.next()) {

				out.print("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
						+ "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6)
						+ "</td><td>" + rs.getString(7) + "</td>");

			}

			out.print("</html></body></table>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
