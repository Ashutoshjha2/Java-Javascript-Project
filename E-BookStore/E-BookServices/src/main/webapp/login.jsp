<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>


<%@include file="common_model.jsp"%>
<%@include file="common.jsp"%>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<style type="text/css">
h5{

animation-duration:3s;
animation-name:update;
animation-iteration-count:infinite;
animation-direction:alternate;
}
@keyframes update{

from{

opacity :1;
background-color:yellow;
color:green;
}
to{
opacity:0;
background-color:orange;
color:red;
}

}


</style>
</head>
<body>
	<div class="container mt-4">
	<p><%@include file="header.jsp" %></p>
	<h5 style="font: italic; color:fuchsia; ; ">*Up Coming Updates*</h5><marquee behavior="alternate" scrollamount="5" ><p style="font: italic; color: red">Coming Soon ? PDF Format Download Book - <i style="font: italic; color:navy;">Download Book Docx format </i><i style="font: italic; color: green;"> - This Is College Project : Using All Data is Dummy  </i></p>
		
		
		
		
		</marquee>
		
		<%@include file="navbar.jsp"%>
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card mt-3">
					<div class="card-header">
						<h3 class="container text-center">Login Here </h3>
						<hr>
						<div class="card-body">


							<%@include file="aleart.jsp"%>
							<form method="post" action="login">

								<div class="form-group">
									<label for="exampleInputEmail1">Enter Email</label> <input
										name="email" type="text" class="form-control"
										id="exampleInputEmail1" aria-describedby="emailHelp"
										placeholder="Enter Email" required="required">

								</div>
								<div class="form-group">
									<label for="exampleInputPassword1">Enter Password</label> <input
										type="password" class="form-control" id="exampleInputPassword1"
										placeholder="Password" name="password" required="required">
								</div>
								<div class="container text-center">
									<button type="submit" class="btn btn-success">Login</button>
									<button type="reset" class="btn btn-warning">Reset</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>

		</div>

	</div>
</body>
</html>