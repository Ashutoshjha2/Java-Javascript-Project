<!DOCTYPE html>
<html lang="en">


<!-- change-password224:03-->
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0">
<link rel="shortcut icon" type="image/x-icon" href="images/favicon.png">
<title>Change_Password</title>
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
	<![endif]-->
</head>

<body>
	<div class="main-wrapper account-wrapper">
		<div class="account-page">
			<div class="account-center">
				<div class="account-box">
					<form class="form-signin" action="changepassword" method="post">
						<div class="account-logo">
							<a class="logo-default" href="#"><img
								src="images/logohospital.png" width="95px;" alt=""
								class="img-responsive"></a>
							<h3 style="color: lightblue; font-size: 25px;">Chitrakoot
								Hospital</h3>
							<hr>
						</div>
						<%@include file="aleart.jsp" %>
						<div class="form-group">
							<label>Enter OTP</label> <input type="text"
								class="form-control" autofocus required="required" placeholder="Enter OTP">
						</div>
						<div class="form-group">
							<label>Enter New Password</label> <input type="text"
								class="form-control" autofocus required="required" placeholder="Enter New Password">
						</div>
						<div class="form-group">
							<label>Confirm Password</label> <input type="text"
								class="form-control" autofocus required="required" placeholder="Enter Confirm Password">
						</div>
						<div class="form-group text-center">
							<button class="btn btn-primary account-btn" type="submit">Reset
								Password</button>
						</div>
						<div class="text-center register-link">
							<a href="${pageContext.request.contextPath }/login">Back to Login</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div class="main-wrapper">
		<div class="account-page">
			<div class="container">
				<h3 class="account-title">Change Password</h3>
				<div class="account-box">
					<div class="account-wrapper">
						<div class="account-logo">
							<a href="index-2.html"><img src="assets/img/logo.png" alt=""></a>
						</div>
						<form
							action="http://dreamguys.co.in/preclinic/template/index.html">
							<div class="form-group form-focus">
								<label class="focus-label">Current Password</label> <input
									class="form-control floating" type="password">
							</div>
							<div class="form-group form-focus">
								<label class="focus-label">New Password</label> <input
									class="form-control floating" type="password">
							</div>
							<div class="form-group form-focus">
								<label class="focus-label">New Repeat Password</label> <input
									class="form-control floating" type="password">
							</div>
							<div class="form-group mb-0 text-center">
								<button class="btn btn-primary btn-block account-btn"
									type="submit">Change Password</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/app.js"></script>
</body>


<!-- change-password224:03-->
</html>