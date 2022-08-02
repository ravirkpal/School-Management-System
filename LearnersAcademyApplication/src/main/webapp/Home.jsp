<!DOCTYPE html>
<html>

<head>
<title>Home</title>
</head>
<link rel="stylesheet" href="Home2.css">

<body style="font-family: 'Roboto', sans-serif;">



	<div class="all">

		<h2>Welcome to Learner's Academy</h2>

		<table>
			<tr>
				<td>Add Student</td>
				<td><form action="Register.html"  method="post">
						<input type="submit" value="student" style="width: 100%">
					</form></td>
			</tr>

			<tr>
				<td>Classes Info</td>
				<td><form action="ClassesFetch.jsp" method="post">
						<input type="submit" value="classes" style="width: 100%">
					</form></td>
			</tr>

			<tr>
				<td>Teacher Info</td>
				<td><form action="TeacherFetch.jsp" method="post">
						<input type="submit" value="teacher" style="width: 100%">
					</form></td>
			</tr>

			<tr>
				<td>Class Report</td>
				<td><form action="ClassReport.jsp" method="post">
						<input type="submit" value="Report" style="width: 100%">
					</form></td>
			</tr>

		</table>

		<a href="LogoutServlet">Logout</a>

	</div>

</body>
</html>