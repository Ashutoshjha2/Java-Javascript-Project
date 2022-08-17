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

		<div class="row mt-4">
			<div class="col-md-12">
				<!-- <card> -->
				<div class="card">

					<h3 class="text-center mb-2">Register Here</h3>
					
					<hr class="hr">

  <form action="register" method="post">
  <%@include file="aleart.jsp"%>
					<div class="form-row">
						<div class="form-group col-md-6 ">
							<label class="label" for="inputEmail4">Enter Name</label> <input
								name="uname" type="text" class="form-control" id="inputEmail4"
								placeholder="Enter Name">
						</div>
						<div class="form-group col-md-6">
							<label for="inputPassword4">Enter Mobile Number</label> <input
								name="mobile" type="number" class="form-control" id="inputPassword4"
								placeholder="Enter Mobile Number">
						</div>
					</div>
					<div class="form-row">
						<div class="form-group col-md-6 ">
							<label class="label" for="inputEmail4">Enter Address</label> <input
								type="address" class="form-control" id="inputEmail4" name="address"
								required="required" placeholder="Enter Address">
						</div>
						<div class="form-group col-md-6">
							<label for="inputAddress">Enter Email Id</label> <input
								type="email" class="form-control" id="inputAddress"
								placeholder="Enter Email Id" required="required" name="email">
						</div>

					</div>
					<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputAddress">Create Password</label> <input
							type="password" class="form-control" id="inputAddress"
							placeholder="Enter Password" required="required" name="password">
					</div>
					<div class="form-group col-md-6">
					<div class="form-check ">
						<input class="form-check-input" type="radio" name="custuser"
							id="exampleRadios1" value="author" checked> <label
							class="form-check-label" for="exampleRadios1">  Author
							 </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="custuser"
							id="exampleRadios2" value="reader"> <label
							class="form-check-label" for="exampleRadios2"> Reader </label>
					</div>
					</div>
					</div>
					
					<div class="container text-center">
						<button type="submit" class="btn btn-outline-success"
							>Register</button>
						<button type="reset" class="btn btn-outline-primary">Reset</a>
					</div>

					</form>
				</div>

			</div>
		</div>

	</div>

	


</body>
</html>