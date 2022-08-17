

<%@page import="java.util.List"%>
<%@page import="com.book.dao.UserDao"%>
<%@page import="com.book.helper.FactoryProvider"%>
<%@page import="com.book.entity.OrderProduct"%>
<%
	Registration loginwithid = (Registration) session.getAttribute("current_user");

	if (loginwithid == null) {
		session.setAttribute("msg", "Login First Buy a Book !!");
		response.sendRedirect("login.jsp");
		return;
	}
	
	
	UserDao ud = new UserDao(FactoryProvider.getFactory());
	loginwithid.getEmail();
	 
	List<OrderProduct> list =ud.getproduct(loginwithid.getEmail());
	
		
	
%>


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

					<h3 class="text-center mb-2">Order Details !!</h3>

					<hr class="hr">

					<div class="table-responsive">

						<table class="table table-hover">
							<thead>
								<tr>
									<th scope="col">Order ID</th>
									<th scope="col">Book Name</th>
									<th scope="col">Book Author</th>
									<th scope="col">Book Price</th>
									<th scope="col">Email Id</th>
									<th scope="col">Shipping Address</th>
									<th scope="col">Alter Mobile</th>
									<th scope="col">Land Mark</th>
								</tr>
							</thead>
							<tbody>


<%
for(OrderProduct op :list)
{
if(loginwithid.equals(op.getEmail()))
{
	

}
%>



								<tr>
									<th scope="row"><%=op.getOrderid() %></th>
									<td><%=op.getBname() %></td>
									<td><%=op.getBauthor() %></td>
									<td><%=op.getBprice() %></td>
									<td><%=op.getEmail() %></td>
									<td><%=op.getShipaddress() %></td>
									<td><%=op.getShipnumber() %></td>
									<td><%=op.getLandmark() %></td>
									
								</tr>
<%}

%>
							</tbody>
						</table>


					</div>


				</div>

			</div>
		</div>

	</div>




</body>
</html>