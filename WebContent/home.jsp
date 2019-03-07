<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Training Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style type="text/css">
.login-form {
	width: 340px;
	margin: 50px auto;
}

.login-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}

.login-form h2 {
	margin: 0 0 15px;
}

.form-control,.btn {
	min-height: 38px;
	border-radius: 2px;
}

.btn {
	font-size: 15px;
	font-weight: bold;
}

#logout {
	margin-left: 390px;
	margin-top: 6px;
}

a {
	font-size: 20px;
	color: white;
}

#nav-link {
	color: white;
}
</style>
</head>
<body>


	<nav class="navbar navbar-expand-sm bg-dark navbar-dark"> <!-- Brand -->


	<!-- Links -->
	<ul class="navbar-nav">
		<LI><a class="navbar-brand" href="#">Training Management
				System</a></LI>
		<li class="nav-item"><a class="nav-link" href="#">HOME</a></li>


		<li class="nav-item "><a class="nav-link"
			href="AdminRegister.jsp">Registration</a></li>


		<!--<li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                      Dropdown link
                    </a>
                    <div class="dropdown-menu">
                      <a class="dropdown-item" href="#">Link 1</a>
                      <a class="dropdown-item" href="#">Link 2</a>
                      <a class="dropdown-item" href="#">Link 3</a>
                    </div>
                  </li> -->
		<li id="logout"><a href="#">Logout</a></li>
	</ul>
	</nav>



	<%
		String userid = session.getAttribute("uname").toString();
	%>
	<%
		String pass = session.getAttribute("pass").toString();
	%>
	hello
	<%=userid%>
	<%=pass%>
	</div>
	<%
		boolean res = (Boolean) request.getAttribute("registraion");
		
		
	%>
	

	<div>
		<%
		
			if (res) {
		%>
		<div class="alert alert-success">
			<strong>Success!</strong> Sucessfully inserted
		</div>
		<%
			} else {
		%>
		<div class="alert alert-danger">
			<strong>OOPS!</strong> Not inserted
		</div>
		<%
			}
		%>
	</div>

</body>
</html>