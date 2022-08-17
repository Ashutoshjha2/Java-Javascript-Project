<%@page import="com.hospital.entity.RegisterPatient"%>
<%@page import="java.util.List"%>
<%@page import="com.hospital.entity.Staff"%>
<%
Staff staff = (Staff)session.getAttribute("current_user");
if(staff== null){
	session.setAttribute("msg", "You Are Not Logged In !!Login First");
	 response.sendRedirect("/chitrakoothospital/login");
	  return;
}else{
	if(staff.getStaffstatus().equals("admin"))
	{
		session.setAttribute("msg", "You Are Not Doctor or Receptionist! Do Not Access This page");
		  response.sendRedirect("/chitrakoothospital/login");
		  return;
	}
	
}

%>
<!doctype html>
<html class="no-js" lang="">
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>
</head>
<body>

	<aside id="left-panel" class="left-panel" style=" background: rgb(0, 155, 119);">
		<nav class="navbar navbar-expand-sm navbar-default" style=" background: rgb(0, 155, 119);">
			<div id="main-menu" class="main-menu collapse navbar-collapse"  >
				<ul class="nav navbar-nav" >
					<li class="menu-title" style="margin-top: 20px; color: white;" ><a href="${pageContext.request.contextPath }/receptiondashboard" class="badge badge-complete" style="color: white;">
							HOME</a></li>
					<li class="menu-item-has-children dropdown" ><a href="${pageContext.request.contextPath }/registration" class="badge badge-complete" style="color: white;">
							Register New Patient</a></li>
					<li class="menu-item-has-children dropdown"><a href="#" class="badge badge-complete" style="color: white;">
							Update Record</a></li>
					<li class="menu-item-has-children dropdown"><a href="${pageContext.request.contextPath }/receptiondashboard" class="badge badge-complete" style="color: white;">
							All Patient</a></li>
							<li class="menu-item-has-children dropdown"><a href="#" class="badge badge-complete" style="color: white;">
							Request Query?for Admin</a></li>
				</ul>
			</div>
		</nav>
	</aside>
	<div id="right-panel" class="right-panel">
		<header id="header" class="header" style=" background: rgb(0, 155, 119);">
			<div class="top-left" >
				<div class="wrapper-logo">
					<a class="logo-default" href="${pageContext.request.contextPath }/receptiondashboard"><img
						src="images/logohospital.png" width="25px;" alt=""
						class="img-responsive"></a>
					<h3 style="color: black; font-size: 20px;">Chitrakoot
						Hospital</h3>
					<div class="clearfix"></div>
					<a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
				</div>
			</div>

			<div class="top-right" >
				<div class="header-menu"  >
					<div class="user-area dropdown float-right" >
						<a style="color: white;" class="dropdown-toggle active btn btn-warning" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false" >Welcome - 
							<%=staff.getStaffusername() %></a>
						<div class="user-menu dropdown-menu">
						<a class="nav-link" href="#"><i class="material-icons" style="font-size:36px"></i>Change Password</a>
							<a class="nav-link" href="${pageContext.request.contextPath }/logout"><i class="fa fa-power-off"></i>Logout</a>
						</div>
					</div>
				</div>
			</div>
		</header>
		<div class="content pb-0">
            <div class="orders">
               <div class="row">
                  <div class="col-xl-12">
                     <div class="card">
                        <div class="card-body">
                       <%@include file="aleart.jsp" %>
                           <h4 class="box-title text-center" style="color: purple;" >All Patient </h4>
                        </div>
                        <div class="card-body--">
                           <div class="table-responsive">
                              <table class="table table-hover ">
                                 <thead>
                                    <tr>
                                       <th class="serial">Options</th>
                                       <th class="avatar">Doctor</th>
                                       <th>ID</th>
                                       <th>Name</th>
                                       <th>Email</th>
                                       <th>Phone</th>
                                       <th>Status</th>
                                    </tr>
                                 </thead>
                                 <tbody>
                                 <% List<RegisterPatient> patients=   (List<RegisterPatient>)session.getAttribute("patient");
                                 for(RegisterPatient patient : patients)
                                 {
                                 %>
                                    <tr>
                                       <td class="serial"><a href="#" style="color: orange;">Edit</a></td>
                                      <td> <span class="doctor">Dr. Virendra</span> </td>
                                       
                                       <td> <%=patient.getPid() %> </td>
                                       <td> <span class="name"><%=patient.getPname() %></span> </td>
                                       <td> <span class="product"><%=patient.getPemail() %></span> </td>
                                       <td><span class="count"><%=patient.getPphone() %></span></td>
                                       <td>
                                          <span class="" style="color: green;">Complete</span>
                                       </td>
                                    </tr>
                                    <%} %>
                                   </tbody>
                              </table>
                           </div>
                        </div>
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
</body>
</html>