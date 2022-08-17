<!DOCTYPE html>
<%@page import="com.hospital.entity.AdmitPatient"%>
<%@page import="com.hospital.entity.Appointment"%>
<%@page import="com.hospital.entity.RegisterPatient"%>
<%@page import="java.util.List"%>
<%@page import="com.hospital.entity.Staff"%>
<html lang="en">

<%
	Staff staff = (Staff) session.getAttribute("current_user");

	if (staff == null) {
		session.setAttribute("msg", "You Are Not Logged In !!Login First");
		response.sendRedirect("chitrakoothospital/login");
		return;
	} else {
		if (staff.getStaffstatus().equals("doctor")) {
			session.setAttribute("msg", "You Are Not Doctor ! Do Not Access This page");
			response.sendRedirect("chitrakoothospital/login");
			return;
		}

	}
%>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0">
<link rel="shortcut icon" type="image/x-icon"
	href="assets/img/favicon.ico">
<title>Admin-DashBoard - Chitrakoot Hospital</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
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
	<div class="main-wrapper">
		<div class="header">
			<div class="header-left">
				<p class="logo">
					<img src="images/logohospital.png" width="45" height="45" alt="">
					<span>Chitrakoot Hospital</span>
				</p>
			</div>
			<a id="toggle_btn" href="javascript:void(0);"><i
				class="fa fa-bars"></i></a> <a id="mobile_btn"
				class="mobile_btn float-left" href="#sidebar"><i
				class="fa fa-bars"></i></a>
			<ul class="nav user-menu float-right">
				<li class="nav-item dropdown d-none d-sm-block"><a href="#"
					class="dropdown-toggle nav-link" data-toggle="dropdown"><i
						class="fa fa-bell-o"></i> <span
						class="badge badge-pill bg-danger float-right"></span></a>
					<div class="dropdown-menu notifications">
						<div class="topnav-dropdown-header">
							<span>Notifications</span>
						</div>
						<div class="drop-scroll">

							<div class="topnav-dropdown-footer"></div>
						</div></li>

				<li class="nav-item dropdown has-arrow"><a href="#"
					class="dropdown-toggle nav-link user-link" data-toggle="dropdown">
						<span class="user-img"> <img class="rounded-circle"
							src="assets/img/user.jpg" width="24" alt="Admin"> <span
							class="status online"></span>
					</span> <span><%=staff.getStaffusername()%></span>
				</a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="profile.html">My Profile</a> <a
							class="dropdown-item" href="edit-profile.html">Edit Profile</a> <a
							class="dropdown-item" href="settings.html">Settings</a> <a
							class="dropdown-item"
							href="${pageContext.request.contextPath }/logout">Logout</a>
					</div></li>
			</ul>
			<div class="dropdown mobile-user-menu float-right">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
				<div class="dropdown-menu dropdown-menu-right">
					<a class="dropdown-item" href="profile.html">My Profile</a> <a
						class="dropdown-item" href="edit-profile.html">Edit Profile</a> <a
						class="dropdown-item" href="settings.html">Settings</a> <a
						class="dropdown-item"
						href="${pageContext.request.contextPath }/logout">Logout</a>
				</div>
			</div>
		</div>
		<div class="sidebar" id="sidebar">
			<div class="sidebar-inner slimscroll">
				<div id="sidebar-menu" class="sidebar-menu">
					<ul>
						<li class="menu-title">Main</li>
						<li class="active"><a
							href="${pageContext.request.contextPath }/admindashboard"><i
								class="fa fa-dashboard"></i> <span>Dashboard</span></a></li>
						<li><a href="doctors.html"><i class="fa fa-user-md"></i>
								<span>Doctors</span></a></li>
						<li><a
							href="${pageContext.request.contextPath }/admitpatient"><i
								class="fa fa-wheelchair"></i> <span>AdmitPatients</span></a></li>
						<li><a href="${pageContext.request.contextPath }/appointment"><i
								class="fa fa-calendar"></i> <span>Appointments</span></a></li>
						<li><a href="#"><i class="fa fa-hospital-o"></i> <span>Departments</span></a></li>

						<li><a href="settings.html"><i class="fa fa-cog"></i> <span>Settings</span></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="page-wrapper">
			<div class="content">
				<div class="row">
					<div class="col-sm-4 col-3">
						<h4 class="page-title">Admit Patient</h4>
					</div>

				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="table-responsive">
							<table class="table table-striped custom-table">
								<thead>
									<tr style="color: background;">
										<th>Reg ID</th>
										<th>Patient Name</th>
										<th>Patient Age</th>
										<th>Patient Phone</th>
										<th>Doctor Name</th>
										<th>Ward No</th>
										<th>Ward Type</th>
										<th>Bed No</th>
										<th>Status</th>
										<th class="text-right">Action</th>
									</tr>
								</thead>
								<tbody>
									<%
										List<AdmitPatient> admitpatient = (List<AdmitPatient>) session.getAttribute("admitpatient");
										for (AdmitPatient admitpatient1 : admitpatient)

										{
									%>
									<tr>
										<td style="color: red">cktd/2021/<%=admitpatient1.getPid()%></td>
										<td><img width="28" height="28" src="assets/img/user.jpg"
											class="rounded-circle m-r-5" alt=""> <%=admitpatient1.getPname()%></td>


										<td><%=admitpatient1.getPage()%></td>
										<td><%=admitpatient1.getPphone()%></td>
										<td style="color: orange;">Dr.Vivek</td>
										<td><%=admitpatient1.getWardno()%></td>
										<td><%=admitpatient1.getWardtype()%>/NON-AC</td>
										<td><%=admitpatient1.getBedno()%></td>
										<td style="color: lime;">ADMIT</td>
										<td class="text-right">
											<div class="dropdown dropdown-action">
												<a href="#" class="action-icon dropdown-toggle"
													data-toggle="dropdown" aria-expanded="false"><i
													class="fa fa-ellipsis-v"></i></a>
												<div class="dropdown-menu dropdown-menu-right">
													<%@ include file="checkup.jsp"%>
													<a class="dropdown-item"
														href="${pageContext.request.contextPath }/shift/<%=admitpatient1.getPid()%>"><i
														class="fa fa-pencil m-r-5"></i> Shift To ICU</a> <a
														class="dropdown-item"
														href="discharge/<%=admitpatient1.getPid()%>"><i
														class="fa fa-trash-o m-r-5"></i> Discharge</a>
													
												</div>
											</div>
										</td>
									</tr>
									<%
										}
									%>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>

			<div id="delete_appointment" class="modal fade delete-modal"
				role="dialog">
				<div class="modal-dialog modal-dialog-centered">
					<div class="modal-content">
						<div class="modal-body text-center">
							<img src="assets/img/sent.png" alt="" width="50" height="46">
							<h3>Are you sure want to delete this Appointment?</h3>
							<div class="m-t-20">
								<a href="#" class="btn btn-white" data-dismiss="modal">Close</a>
								<button type="submit" class="btn btn-danger">Delete</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- // -->

			<!-- // -->
		</div>
	</div>
	<div class="sidebar-overlay" data-reff=""></div>
	<script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script src="assets/js/jquery.slimscroll.js"></script>
	<script src="assets/js/Chart.bundle.js"></script>
	<script src="assets/js/chart.js"></script>
	<script src="assets/js/app.js"></script>

</body>



</html>