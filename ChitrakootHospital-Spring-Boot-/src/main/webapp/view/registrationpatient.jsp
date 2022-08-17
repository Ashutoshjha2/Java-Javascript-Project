<%@page import="com.hospital.entity.Staff"%>
<%
	Staff staff = (Staff) session.getAttribute("current_user");
%>
<!doctype html>
<html class="no-js" lang="">
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<title>Welcome Receptionist</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="reception/assets/css/normalize.css">
<link rel="stylesheet" href="reception/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="reception/assets/css/font-awesome.min.css">
<link rel="stylesheet" href="reception/assets/css/themify-icons.css">
<link rel="stylesheet" href="reception/assets/css/pe-icon-7-filled.css">
<link rel="stylesheet" href="reception/assets/css/flag-icon.min.css">
<link rel="stylesheet" href="reception/assets/css/cs-skin-elastic.css">
<link rel="stylesheet" href="reception/assets/css/style.css">
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/select2.min.css">
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>
</head>
<body>

	<aside id="left-panel" class="left-panel"
		style="background: rgb(0, 155, 119);">
		<nav class="navbar navbar-expand-sm navbar-default"
			style="background: rgb(0, 155, 119);">
			<div id="main-menu" class="main-menu collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="menu-title" style="margin-top: 20px; color: white;" ><a href="${pageContext.request.contextPath }/receptiondashboard" class="badge badge-complete" style="color: white;">
							HOME</a></li>
					<li class="menu-item-has-children dropdown"><a
						href="${pageContext.request.contextPath }/registration"
						class="badge badge-complete" style="color: white;"> Register
							New Patient</a></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="badge badge-complete" style="color: white;"> Update
							Record</a></li>
					<li class="menu-item-has-children dropdown"><a href="${pageContext.request.contextPath }/receptiondashboard"
						class="badge badge-complete" style="color: white;"> All
							Patient</a></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="badge badge-complete" style="color: white;"> Request
							Query?for Admin</a></li>
				</ul>
			</div>
		</nav>
	</aside>
	<div id="right-panel" class="right-panel">
		<header id="header" class="header"
			style="background: rgb(0, 155, 119);">
			<div class="top-left">
				<div class="wrapper-logo">
					<a class="logo-default"
						href="${pageContext.request.contextPath }/receptiondashboard"><img
						src="images/logohospital.png" width="25px;" alt=""
						class="img-responsive"></a>
					<h3 style="color: black; font-size: 20px;">Chitrakoot Hospital</h3>
					<div class="clearfix"></div>
					<a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
				</div>
			</div>

			<div class="top-right">
				<div class="header-menu">
					<div class="user-area dropdown float-right">
						<a style="color: white;"
							class="dropdown-toggle active btn btn-warning"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Welcome
							- <%=staff.getStaffusername()%></a>
						<div class="user-menu dropdown-menu">
							<a class="nav-link" href="#"><i class="material-icons"
								style="font-size: 36px"></i>Change Password</a> <a class="nav-link"
								href="${pageContext.request.contextPath }/logout"><i
								class="fa fa-power-off"></i>Logout</a>
						</div>
					</div>
				</div>
			</div>
		</header>
		<div class="content pb-0">
			<div class="orders">
				<div class="row">
					<div class="col-xl-12">
						<div class="card" style="background: rgb(204, 255, 255);">
							<div class="card-body" style="background: rgb(0, 255, 255);">
							<h4 class="page-title" style="margin-left: 40%; color: black;">Registration A Patient</h4>
							</div>
							<!--  #Start -->

							<div class="content">
								
								<div class="row">
									<div class="col-lg-8 offset-lg-2">
										<form action="register" method="post">
											<div class="row">
												<div class="col-sm-6">
													<div class="form-group">
														<label>First Name <span class="text-danger">*</span></label>
														<input class="form-control" type="text" required="required" name="pname">
													</div>
												</div>
												<div class="col-sm-6">
													<div class="form-group">
														<label>Last Name<span class="text-danger">*</span> </label> <input class="form-control"
															type="text" required="required" name="plname">
													</div>
												</div>
												<div class="col-sm-6">
													<div class="form-group">
														<label>Phone <span class="text-danger">*</span></label> <input class="form-control"
															type="text" required="required" name="pphone">
													</div>
												</div>
												<div class="col-sm-6">
													<div class="form-group">
														<label>Email <span class="text-danger">*</span></label> <input
															class="form-control" type="email" required="required" name="pemail">
													</div>
												</div>
												
												<div class="col-sm-6">
													<div class="form-group">
														<label>Age<span class="text-danger">*</span></label>
														<div class="form-group">
															<input type="number" class="form-control" required="required" name="pdob">
														</div>
													</div>
												</div>
												<div class="col-sm-6">
													<div class="form-group gender-select">
														<label class="gen-label">Gender:<span class="text-danger">*</span></label>
														<div class="form-check-inline">
															<label class="form-check-label"> <input
																type="radio" name="gender" class="form-check-input" value="male" required="required">Male
															</label>
														</div>
														<div class="form-check-inline">
															<label class="form-check-label"> <input
																type="radio" name="gender" class="form-check-input" value="female" required="required">Female
															</label>
														</div>
													</div>
												</div>
												<div class="col-sm-12">
													<div class="row">
														<div class="col-sm-6">
															<div class="form-group">
																<label>Address<span class="text-danger">*</span></label> <input type="text"
																	class="form-control " required="required" name="paddress">
															</div>
														</div>
														
														<div class="col-sm-6">
															<div class="form-group">
																<label>City<span class="text-danger">*</span></label> <input type="text"
																	class="form-control" required="required" name="pcity">
															</div>
														</div>
														
														
													</div>
												</div>
												
											<div class="m-t-20 text-center">
												<button class="btn btn-primary submit-btn">Register Now</button>
											</div>
										</form>
									</div>
								</div>
							</div>

							<!--   #End -->

						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>

	</div>

	<script src="reception/assets/js/vendor/jquery-2.1.4.min.js"
		type="text/javascript"></script>
	<script src="reception/assets/js/popper.min.js" type="text/javascript"></script>
	<script src="reception/assets/js/plugins.js" type="text/javascript"></script>
	<script src="reception/assets/js/main.js" type="text/javascript"></script>
	<div class="sidebar-overlay" data-reff=""></div>
	<script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.slimscroll.js"></script>
	<script src="assets/js/select2.min.js"></script>
	<script src="assets/js/moment.min.js"></script>
	<script src="assets/js/bootstrap-datetimepicker.min.js"></script>
	<script src="assets/js/app.js"></script>
</body>
</html>