<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<style>
h3 {
	color: blue;
}

p {
	color: blue;
}
</style>
</head>
<header>
	<h3>Training Institute</h3>
</header>
<body>
	<form action="studentvalues" method="POST">

		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id"></td>
			</tr>

			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="firstName"></td>
			</tr>

			<tr>
				<td>LastName:</td>
				<td><input type="text" name="lastName"></td>
			</tr>

			<tr>
				<td>Contact:</td>
				<td><input type="text" name="contact"></td>
			</tr>

			<tr>
				<td>Location:</td>
				<td><input type="text" name="location"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>

	</form>

	<footer>
		<p>&copy; 2020 Training Institute</p>
	</footer>
</body>
</html>