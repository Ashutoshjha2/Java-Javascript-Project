<!DOCTYPE html>
<html lang="en">


<!-- login23:11-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon.png">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
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
                    <form action="dashboard" method="post">
                  
						<div class="account-logo">
                            <a class="logo-default" href="#"><img
											src="images/logohospital.png" width="95px;" alt=""
											class="img-responsive"></a>
										<h3 style="color: lightblue; font-size: 25px;">Chitrakoot
											Hospital</h3>
											<hr>
											<%@include file="aleart.jsp" %>
                        </div>
                        <div class="form-group">
                            <label>Username or Email</label>
                            <input type="email" autofocus="" class="form-control" name="email" required="required">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" required="required">
                        </div>
                        <div class="form-group text-right">
                            <a href="${pageContext.request.contextPath }/forgot">Forgot your password?</a>
                        </div>
                        <div class="form-group text-center">
                            <button type="submit" class="btn btn-warning account-btn">Login</button>
                            <button type="reset" class="btn btn-success account-btn">Reset</button>
                        </div>
                        <div class="text-center register-link" style="color: fuchsia;">
                            Don't have an account? <a href="register.html">Request Now</a>
                        </div>
                        <div class="text-center register-link" style="color: orange;">
                           Back To Home ? <a href="${pageContext.request.contextPath }/home">Click Me</a>
                        </div>
                    </form>
                </div>
			</div>
        </div>
    </div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/app.js"></script>
</body>


<!-- login23:12-->
</html>