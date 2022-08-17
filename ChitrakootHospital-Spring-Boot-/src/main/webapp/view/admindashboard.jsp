<!DOCTYPE html>
<%@page import="com.hospital.entity.AmbulenceBooking"%>
<%@page import="com.hospital.entity.Appointment"%>
<%@page import="com.hospital.entity.RegisterPatient"%>
<%@page import="java.util.List"%>
<%@page import="com.hospital.entity.Staff"%>
<html lang="en">

<%
	Staff staff = (Staff) session.getAttribute("current_user");

	if (staff == null) {
		session.setAttribute("msg", "You Are Not Logged In !!Login First");
		response.sendRedirect("/chitrakoothospital/login");
		return;
	} else {
		if (staff.getStaffstatus().equals("reception")) {
			session.setAttribute("msg", "You Are Not admin! Do Not Access This page");
			response.sendRedirect("/chitrakoothospital/login");
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
								class="fa fa-wheelchair"></i> <span>AdmitPatient</span></a></li>
						<li><a href="${pageContext.request.contextPath }/appointment"><i
								class="fa fa-calendar"></i> <span>Appointments</span></a></li>
						<li><a href="departments.html"><i
								class="fa fa-hospital-o"></i> <span>Departments</span></a></li>

						<li><a href="settings.html"><i class="fa fa-cog"></i> <span>Settings</span></a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="page-wrapper">
			<div class="content">
				<div class="row">
					<div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
						<div class="dash-widget">
							<span class="dash-widget-bg1"><i class="fa fa-stethoscope"
								aria-hidden="true"></i></span>
							<div class="dash-widget-info text-right">
								<h3>1</h3>
								<span class="widget-title1">Doctors <i
									class="fa fa-check" aria-hidden="true"></i></span>
							</div>
						</div>
					</div>
					<div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
						<div class="dash-widget">
							<span class="dash-widget-bg2"><i class="fa fa-user-o"></i></span>
							<div class="dash-widget-info text-right">
								<%
									List<RegisterPatient> patients1 = (List<RegisterPatient>) session.getAttribute("patient");
								%>
								<h3><%=patients1.size()%></h3>
								<span class="widget-title2">Patients <i
									class="fa fa-check" aria-hidden="true"></i></span>
							</div>
						</div>
					</div>
					<div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
						<div class="dash-widget">
							<span class="dash-widget-bg3"><i class="fa fa-user-md"
								aria-hidden="true"></i></span>
							<div class="dash-widget-info text-right">
								<%
									List<Appointment> appointmentofsize = (List<Appointment>) session.getAttribute("appointment");
								%>
								<h3><%=appointmentofsize.size()%></h3>
								<span class="widget-title3"> Appointments <i
									class="fa fa-check" aria-hidden="true"></i></span>
							</div>
						</div>
					</div>
					<div class="col-md-6 col-sm-6 col-lg-6 col-xl-3">
						<div class="dash-widget">
							<span class="dash-widget-bg4"><i class="fa fa-heartbeat"
								aria-hidden="true"></i></span>
							<div class="dash-widget-info text-right">
								<%
									List<AmbulenceBooking> appointmentofsizepending = (List<AmbulenceBooking>) session
											.getAttribute("ambulence");
								%>
								<h3><%=appointmentofsizepending.size()%></h3>
								<span class="widget-title4">Ambulence <i
									class="fa fa-check" aria-hidden="true"></i></span>
							</div>

						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-header">
								<h4 class="card-title d-inline-block" style="color: gray;">Upcoming Appointments</h4>
								<a href="appointments.html" class="btn btn-primary float-right">View
									all</a>
							</div>
							<div class="card-body p-0">
								<div class="table-responsive">
									<table class="table mb-0">
										<thead class="d-none">
											<tr>
												<th>Patient Name</th>
												<th>Doctor Name</th>
												<th>Date</th>
												<th class="text-right">Status</th>
											</tr>
										</thead>
										<tbody>
											<%
												List<Appointment> appointment = (List<Appointment>) session.getAttribute("appointment");
												for (Appointment appointment1 : appointment)

												{
											%>

											<tr>
												<td>
													<h5 class="time-title p-0">Patient Name</h5>
													<p>
														<%=appointment1.getName()%>
													<p>
												</td>
												<td>
													<h5 class="time-title p-0">Phone</h5>
													<p><%=appointment1.getPhone()%></p>
												</td>
												<td>
													<h5 class="time-title p-0">Appointment With</h5>
													<p>Dr. Vivek</p>
												</td>
												<td>
													<h5 class="time-title p-0">date</h5>
													<p><%=appointment1.getDate1()%></p>
												</td>
												<td>
													<h5 class="time-title p-0">Status</h5> <%
 	if (appointment1.getBookstatus().equals("pending")) {
 %>

													<p style="color: red;"><%=appointment1.getBookstatus()%></p>
													<%
														} else {
													%>
													<p style="color: lime;"><%=appointment1.getBookstatus()%></p>
													<%
														}
													%>
												</td>
												<td class="text-right"><a
													href="${pageContext.request.contextPath }/appointment"
													class="btn btn-outline-primary take-btn">Take up</a></td>
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

				</div>
				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-header">
								<h4 class="card-title d-inline-block" style="color: lime;">New Patients</h4>
								<a href="${pageContext.request.contextPath }/admitpatient" class="btn btn-primary float-right">View
									All</a>
							</div>
							<div class="card-block">
								<div class="table-responsive">
									<table class="table mb-0 new-patient-table">
										<tbody>
											<%
												List<RegisterPatient> patients = (List<RegisterPatient>) session.getAttribute("patient");
												for (RegisterPatient patient : patients) {
											%>
											<tr>
											<td><%=patient.getPid()%></td>
												<td><img width="28" height="28" class="rounded-circle"
													src="assets/img/user.jpg" alt="">
													
													<h2><%=patient.getPname()%></h2></td>
												<td><%=patient.getPemail()%></td>
												<td><%=patient.getPphone()%></td>
												<td><%=patient.getGender()%></td>
												<td><%=patient.getPdob()%></td>
												<td><%=patient.getPaddress()%></td>
												<td>
												<%if(patient.getAdmitstatus().equals("notadmit"))
													{
													%>
													<p style="color: red;"><%=patient.getAdmitstatus()%></p>
													<%}else{ %>
													<p style="color: lime;"><%=patient.getAdmitstatus()%></p>
													<%
														}
													%>
													</td>
												<td class="text-right">
											<div class="dropdown dropdown-action" style="margin-top: 25px;">
												<a href="#" class="action-icon dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
												<div class="dropdown-menu dropdown-menu-right" >
												
													
													<%
													if(patient.getAdmitstatus().equals("notadmit")){
													%>
													<a class="dropdown-item" href="admit/<%=patient.getPid() %>" ><i class="fa fa-pencil m-r-5"></i> Admit</a>
													<a class="dropdown-item" href="delete/" ><i class="fa fa-trash-o m-r-5"></i> Reffer</a>
												<%}else{ %>
												
												<a class="dropdown-item" href="${pageContext.request.contextPath }/admitpatient"  ><i class="fa fa-plus-o m-r-5"></i> view</a>
												<a class="dropdown-item" href="delete/" ><i class="fa fa-add-o m-r-5"></i> Reffer</a>
												<%} %>
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
				</div>
				<!-- ambulence -->
				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-header">
								<h4 class="card-title d-inline-block" style="color: orange;">Ambulence Reffer Booking</h4>
								<a href="appointments.html" class="btn btn-primary float-right">View
									all</a>
							</div>
							<div class="card-body p-0">
								<div class="table-responsive">
									<table class="table mb-0">
										<thead class="d-none">
											<tr>
												<th>Booking ID</th>
												<th>Booking Name</th>
												<th>Booking Email</th>
												<th>Booking Phone</th>
												<th class="text-right">Status</th>
											</tr>
										</thead>
										<tbody>
											<%
												List<AmbulenceBooking> ambulences = (List<AmbulenceBooking>)  session.getAttribute("ambulence");
												for (AmbulenceBooking ambulence : ambulences)

												{
											%>

											<tr>
												<td>
													<h5 class="time-title p-0">Reffer Hospital</h5>
													<p style="color: rgb(52, 220, 210);"><%=ambulence.getReffername()%></p>
												</td>
												<td>
													<h5 class="time-title p-0">Booking Name</h5>
													<p style="color: rgb(52, 220, 210);"><%=ambulence.getUname()%></p>
												</td>
												
												<td>
													<h5 class="time-title p-0">Phone</h5>
													<p style="color: rgb(52, 220, 210);"><%=ambulence.getMobile()%></p>
												</td>
												
												<td>
													<h5 class="time-title p-0">Ambulence Type</h5>
													<p style="color: rgb(52, 220, 210);">SMART/AC/<%=ambulence.getBookinground()%></p>
												</td>
												<td>
													<h5 class="time-title p-0">Total Payment</h5>
													<%if(ambulence.getBookinground().equals("round")) {%>
													<p style="color: rgb(52, 220, 210);">200</p>
													<%}else{
														%>
														<p style="color: rgb(52, 220, 210);">Free Service</p>
														
												<%	} %>
												</td>
												<td>
													<h5 class="time-title p-0">Payment Type</h5>
													<p style="color: rgb(52, 220, 210);"><%=ambulence.getPaytype()%></p>
												</td>
												<td>
													<h5 class="time-title p-0">Payment Status</h5> <%
 	if (ambulence.getPaystatus().equals("pending")) {
 %>

													<p style="color: red;"><%=ambulence.getPaystatus()%></p>
													<%
														} else {
													%>
													<p style="color: lime;"><%=ambulence.getPaystatus()%></p>
													<%
														}
													%>
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

				</div>
			</div>

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