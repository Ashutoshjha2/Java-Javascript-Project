<%@page import="com.book.entity.Registration"%>

<%
	Registration loginwithid1 = (Registration) session.getAttribute("current_user");
%>

<nav class="navbar navbar-expand-lg navbar-dark"
	style="background: #7b1fa2">
	<div class="container">
		<a class="navbar-brand" href="index.jsp">E-Book Service</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
				<li class="nav-item active"><a class="nav-link"
					href="about.jsp">About</a></li>
				<li class="nav-item dropdown active"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Book Author </a>


					<div class="dropdown-menu" aria-labelledby="navbarDropdown">

						<a class="dropdown-item" href="#">
							<div class="dropdown-divider drop"></div>
						</a>

					</div></li>
			</ul>

			<ul class="navbar-nav ml-auto">

				<li class="nav-item active"><a class="nav-link" href="#!"
					data-toggle="modal" data-target="#cart"> <i
						class="fa fa-cart-plus" style="font-size: 20px;"> <span
							class="cart-item" data-toggle="modal" data-target="#cart">

						</span>
					</i></a></li>
					
					<%
					if (loginwithid1 == null) {
				%>

				<li class="nav-item active"><a class="nav-link"
					href="login.jsp" >Login </a></li>
				<li class="nav-item active"><a class="nav-link"
					href="register.jsp">Register

</a></li>
                <%
					}
				%>
						
						<%
					if (loginwithid1 != null) {
				%>
						<li class="nav-item dropdown active"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"><%=loginwithid1.getUname()%>  </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="orderdetails.jsp">My Order</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#">Change Password</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="Logout">Logout</a>
							</div></li> <a href="<%=loginwithid1.getAdminstatus().equals("admin") ? "adminpanel.jsp" : "authorpanel.jsp"%>"><img style="max-width: 30px;"
							src="images/profile.png"></a>
							<%
					}
				%>
			</ul>

		</div>

	</div>
</nav>



<%@include file="common_model.jsp"%>