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

		<p><%@include file="header.jsp"%></p>
		<h5 style="font: italic; color: fuchsia;">*Up Coming Updates*</h5>
		<marquee behavior="alternate" scrollamount="5">
			<p style="font: italic; color: red">
				Coming Soon ? PDF Format Download Book - <i
					style="font: italic; color: navy;">Download Book Docx format </i><i
					style="font: italic; color: green;"> - This Is College Project
					: Using All Data is Dummy </i>
			</p>




		</marquee>
		<%@include file="navbar.jsp"%>

		<div class="row mt-4">
			<div class="col-md-12">
				<!-- <card> -->
				<div class="card">

					<h3 class="text-center mb-2">SuccessFully Placed Order !!</h3>

					<hr class="hr">


					<%@include file="aleart.jsp"%>
<a href="index.jsp" type="submit" class="btn btn-outline-primary">Home Page</a>
				</div>
				
			</div>
		</div>

	</div>




</body>
</html>