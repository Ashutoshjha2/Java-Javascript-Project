<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>



<%@include file="common.jsp"%>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


</head>
<body>
	<div class="container mt-4">



		<div class="row mt-4">
			<div class="col-md-12">
				<!-- <card> -->
				<div class="card" style="background: rgb(52, 70, 95); color: white;">

					<h3 class="text-center mb-2" style="color: rgb(145, 188, 198);">Ambulence
						Booking</h3>

					<hr class="hr">

					<form action="bookingambulence" method="post">
						<%@include file="aleart.jsp"%>
						<div class="form-row">
							<div class="form-group col-md-6 ">
								<label class="label" for="inputEmail4">Enter Name</label> <input
									name="uname" type="text" class="form-control" id="inputEmail4"
									placeholder="Enter Name" required="required">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Enter Mobile Number</label> <input
									name="mobile" type="number" class="form-control"
									id="inputPassword4" placeholder="Enter Mobile Number" required="required">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6 ">
								<label class="label" for="inputEmail4">Enter Address</label> <input
									type="address" class="form-control" id="inputEmail4"
									name="address" required="required" placeholder="Enter Address">
							</div>
							<div class="form-group col-md-6">
								<label for="inputAddress">Enter Email Id</label> <input
									type="email" class="form-control" id="inputAddress"
									placeholder="Enter Email Id" required="required" name="email">
							</div>

						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputState">Select Reffer Location Hospital</label> <select id="inputState"
									class="form-control" name="reffername" required="required">
									
									<option selected>Satna</option>
									<option>Allahabad</option>
									<option>Lucknow</option>
									<option>Delhi</option>
									<option>Nagpur</option>
								</select>
							</div>
							<div class="form-group col-md-6">
								<div class="form-check ">
									<input class="form-check-input" type="radio"
										name="bookinground" id="exampleRadios1" value="oneway" checked>
									<label class="form-check-label" for="exampleRadios1">
										Oneway<i style="color: red">* (Free Oneway Booking)</i>
									</label>
								</div>
								<div class="form-check">
									<input class="form-check-input" type="radio"
										name="bookinground" onclick="round" id="exampleRadios2"
										value="round"> <label class="form-check-label"
										for="exampleRadios2"> Round <i style="color: red">*
											(Paid Booking - 200/Day )</i>
									</label>
								</div>


							</div>
						</div>


						<div class="container text-center">
							<button type="submit" class="btn btn-outline-success">Book
								Now</button>
							<button type="reset" class="btn btn-outline-primary">
								Reset</button>
							<a href="${pageContext.request.contextPath }/home"
								class="btn btn-outline-warning">Home</a>
						</div>

					</form>
				</div>

			</div>
		</div>

	</div>




</body>
</html>