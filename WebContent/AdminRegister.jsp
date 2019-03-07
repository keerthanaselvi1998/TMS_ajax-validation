<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>SearchBar</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.required input {
	display: inline-flex !important;
}
</style>
<link rel="stylesheet" type="text/css" media="screen" href="main.css">
<link rel="stylesheet" type="text/css" href="rest.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="main.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#userId").change(function() {

			$.ajax({
				type : 'post',
				url : 'DbCheck',
				data : {
					id : $("#userId").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);

					if (responseText != "") {
						$("#userId").focus();
					}

				}

			});

		});
	});
</script>
</head>

<body>
	<div id="trainee">
		Registration User Details

		<h1>Registration Form</h1>

		<form action="./Regservlet" method="post">

			<label> Associate id * : <input type="text" name="userId"
				id="userId" size="30" /><span id="errMsg"></span>
			</label><br /> <label> Password * : <input type="password"
				name="password" size="30" />
			</label><br /> <label> First Name * : <input type="text"
				name="fname" size="30" />
			</label><br /> <label> Last Name * : <input type="text" name="lname"
				size="30" />
			</label><br /> <label> Hire Date *: <input type="date" name="date"
				size="30" />
			</label><br /> <label> Vertical * : <input type="text"
				name="vertical" size="30" />
			</label><br /> <label> Designation * : <input type="text"
				name="Designation" size="30" />
			</label><br /> <label> Location * : <input type="text"
				name="Location" size="30" />
			</label><br /> <label> Phone * : <input type="text" name="phone"
				size="30" />
			</label><br /> <label> Role * : <input type="text" name="role"
				size="30" />
			</label><br /> <input type="submit" value="submit" />
		</form>
	
</body>

</html>