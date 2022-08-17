<!DOCTYPE html>
<html lang="en">


<!-- forgot-password24:03-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="images/favicon.png">
    <title>Forgot_Password</title>
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
                    <form class="form-signin" action="forgotpassword" method="post">
						<div class="account-logo">
                           <a class="logo-default" href="#"><img
											src="images/logohospital.png" width="95px;" alt=""
											class="img-responsive"></a>
										<h3 style="color: lightblue; font-size: 25px;">Chitrakoot
											Hospital</h3>
											<hr>
                        </div>
                        <div class="form-group">
                            <label>Enter Your Email</label>
                            <input type="email" class="form-control" autofocus name="email" placeholder="Enter Register Email Id" required="required">
                        </div>
                        <div class="form-group text-center">
                            <button class="btn btn-primary account-btn" type="submit">Get OTP</button>
                        </div>
                        <div class="text-center register-link">
                            <a href="${pageContext.request.contextPath }/login">Back to Login</a>
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


<!-- forgot-password24:03-->
</html>