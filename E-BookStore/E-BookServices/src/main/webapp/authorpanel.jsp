<%@page import="java.util.List"%>
<%@page import="com.book.dao.ReaderDao"%>
<%@page import="com.book.entity.Registration"%>
<%@page import="com.book.helper.FactoryProvider"%>

<%
	Registration loginwithid= (Registration)  session.getAttribute("current_user");

  if(loginwithid==null)
  {
	  session.setAttribute("msg", "You Are Not Logged In !!Login First");
	 response.sendRedirect("login.jsp");
	  return;
  }
  else{
	  if(loginwithid.getCuststatus().equals("reader"))
	  {
		  session.setAttribute("msg", "You Are Not Admin or Author! Do Not Access This page");
		  response.sendRedirect("index.jsp");
		  return;
	  }
  }
%>


<%

ReaderDao r = new ReaderDao(FactoryProvider.getFactory());
List<Registration> l=r.getallreader("reader");
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
	<div class="container admin">
	<p><%@include file="header.jsp" %></p>
	<h5 style="font: italic; color:fuchsia; ; ">*Up Coming Updates*</h5><marquee behavior="alternate" scrollamount="5" ><p style="font: italic; color: red">Coming Soon ? PDF Format Download Book - <i style="font: italic; color:navy;">Download Book Docx format </i><i style="font: italic; color: green;"> - This Is College Project : Using All Data is Dummy  </i></p>
		
		
		
		
		</marquee>
		<%@include file="navbar.jsp"%>
			<div class="row mt-3">
			<!-- first -->
			<div class="col-md-4">
				<div class="card" data-toggle="modal" data-target="#exampleModal">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 120px;" 
								src="images/more.png">
						</div>
						<p>click here to More Options</p>
						<h1>More </h1>
						<%@ include file="updatedeletebook.jsp" %>
					</div>
				</div>
			</div>
			
			<!-- second -->
			<div class="col-md-4">
				<div class="card"  data-toggle="modal" data-target=".bd-example-modal-lg">
				<!-- data-toggle="modal" data-target="#add-categories" -->
					<div class="card-body text-center" >
						<div class="container">
							<img style="max-width: 120px;" 
								src="images/reader.png">
						</div>
						<p>No. Of Reader</p>
						<h1><%=l.size() %></h1>
						<%@ include file="readerdata.jsp" %>
					</div>
				</div>
			</div>
			<!-- third -->
			<div class="col-md-4">
			<!-- data-toggle="modal" data-target="#add-product" -->
				<div class="card" data-toggle="modal"
					data-target="#exampleModalproduct">
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 120px;" 
								src="images/bookadd.png">
						</div>
						<p>click here to add new Book</p>
						<h1>New Book</h1>
					</div>
				</div>
			</div>
		</div>
		
		<!-- second row -->
		<div class="row mt-2">
			<div class="col-md-4">
				<div class="card" >
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 120px;" 
								src="images/delivery-box.png">
						</div>
						<p>View Delivery</p>
						<h1>Delivery Order</h1>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card" >
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 120px;" 
								src="images/delivery_product.png">
						</div>
						<p>New Order</p>
						<a href="orderdetailsall.jsp"><h1>Click Here</h1> </a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card" >
					<div class="card-body text-center">
						<div class="container">
							<img style="max-width: 120px;" 
								src="images/email.png">
						</div>
						<p>Send A Email To Admin</p>
						<h1>Admin</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<%@include file="addcategories.jsp"%>
	<%@include file="addbook.jsp"%>
</body>
</html>