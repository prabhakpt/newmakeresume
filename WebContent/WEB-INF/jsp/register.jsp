<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form>
			<div class="form-group">
				<label for="exampleInputEmail1">User Name</label>
				 <input	type="text" class="form-control" id="userName">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> 
				<input type="password" class="form-control" id="password" placeholder="Password">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> 
				<input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>

</body>
</html>