
<%
	Registration loginwithid = (Registration) session.getAttribute("current_user");

	if (loginwithid == null) {
		session.setAttribute("msg", "Login First Buy a Book !!");
		response.sendRedirect("login.jsp");
		return;
	}
%>
<!doctype html>
<%@page import="com.book.entity.Categories"%>
<%@page import="com.book.dao.CategorieDao"%>
<%@page import="com.book.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.book.dao.BookDao"%>
<%@page import="com.book.helper.FactoryProvider"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<%@include file="common_model.jsp"%>
<%@include file="common.jsp"%>
<title>Home Page!</title>
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

					<div class="card-body cartuserdetails">
						<h3 class="text-center mb-2">Your Book</h3>
						<hr class="hr">
						<form action="payment" method="post">
							<div class="cart">

								<div class="table-responsive">
									<table class="table table-hover">
										<%
											String image = request.getParameter("bimg");
											int id = Integer.parseInt(request.getParameter("bid"));
											String bname = request.getParameter("bname");
											String bprice = request.getParameter("bmrp");
											String bauthor = request.getParameter("bwritten");
											String bpage = request.getParameter("bpage");
										%>

										<thead>
											<tr>
												<th scope="col">ID</th>
												<th scope="col">Book Image</th>
												<th scope="col">Book Name</th>
												<th scope="col">Book Price</th>
												<th scope="col">Book Author</th>
												<th scope="col">Book Page</th>
											</tr>
										</thead>
										<tbody>

											<tr>
												<th scope="row"><%=id%></th>
												<td><img src="images/product/<%=image%>"
													style="max-height: 50px; max-width: 120px; width: auto;"
													alt=""></td>
												<td><%=bname%></td>
												<td><%=bprice%></td>
												<td><%=bauthor%></td>
												<td><%=bpage%></td>
											</tr>

										</tbody>
									</table>
								</div>

							</div>
							<hr>
							<h3 class="text-center mb-2">Fill Details For Order</h3>
							<hr class="hr">
							<input type="hidden" name="id" value="<%=id%>"> <input
								type="hidden" name="bname" value="<%=bname%>"> <input
								type="hidden" name="bprice" value="<%=bprice%>"> <input
								type="hidden" name="bauthor" value="<%=bauthor%>"> <input
								type="hidden" name="bpage" value="<%=bpage%>">

							<div class="form-row">
								<div class="form-group col-md-6 ">
									<label class="label" for="inputEmail4">User Name</label> <input
										value="<%=loginwithid.getUname()%>" type="text"
										class="form-control" id="inputEmail4" readonly="readonly"
										name="uname">
								</div>
								<div class="form-group col-md-6">
									<label for="inputPassword4">User Mobile Number</label> <input
										value="<%=loginwithid.getMobile()%>" type="number"
										class="form-control" id="inputPassword4" readonly="readonly"
										name="umobile">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6 ">
									<label class="label" for="inputEmail4">Shipping Name</label> <input
										type="text" class="form-control" id="inputEmail4"
										required="required" name="ushipping">
								</div>
								<div class="form-group col-md-6">
									<label for="inputAddress">Alternate Mobile No</label> <input
										type="number" class="form-control" id="inputAddress"
										placeholder="Enter Mobile Number" required="required"
										name="altermobile">
								</div>

							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputAddress">Shipping Address</label> <input
										type="text" class="form-control" id="inputAddress"
										placeholder="Enter Shipping Address" required="required"
										name="shipaddress" value="<%=loginwithid.getAddress()%>">
								</div>
								<div class="form-group col-md-6">
									<label for="inputAddress"> Your Register Email Id</label> <input
										type="email" class="form-control" id="inputAddress"
										placeholder="Your Email id" required="required"
										name="email" value="<%=loginwithid.getEmail()%>" readonly="readonly">
								</div>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="inputCity">Land Mark</label> <input type="text"
										class="form-control" id="Land Mark" required="required"
										placeholder="Enter Land Mark" name="landmark">
								</div>
								<div class="form-group col-md-6">
									<label for="inputState">Select Location</label> <select
										id="inputState" class="form-control" required="required"
										name="location">
										<option selected>Choose...</option>
										<option>Chitrakoot,sitapur</option>
										<option>Bhopal</option>
										<option>Indore</option>
										<option>hyderabad</option>
										<option>Chennai</option>
										<option>Jabalpur</option>
									</select>
								</div>
							</div>
							<div class="container text-center">
								<button type="submit" class="btn btn-outline-success">Proceed
									To Checkout</button>
								<a href="index.jsp" type="submit"
									class="btn btn-outline-primary">Cancel</a>
							</div>

						</form>
					</div>

				</div>
			</div>

		</div>

	</div>
	</div>


</body>
</html>






