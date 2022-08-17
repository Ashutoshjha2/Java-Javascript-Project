<%@page import="com.book.dao.CategorieDao"%>
<%@page import="com.book.entity.Categories"%>
<%@page import="com.book.entity.Categories"%>
<%@page import="java.util.List"%>
<%@page import="com.book.helper.FactoryProvider"%>
<%@page import="com.book.dao.CategorieDao"%>
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
		<h5 style="font: italic; color:fuchsia; ; ">*Up Coming Updates*</h5><marquee behavior="alternate" scrollamount="5" ><p style="font: italic; color: red">Coming Soon ? PDF Format Download Book - <i style="font: italic; color:navy;">Download Book Docx format </i><i style="font: italic; color: green;"> - This Is College Project : Using All Data is Dummy  </i></p>
		
		
		
		
		</marquee>
		<%@include file="navbar.jsp"%>

		<div class="row mt-4">
			<div class="col-md-12">
				<!-- <card> -->
				<div class="card">

					<h3 class="text-center mb-2">ADD BOOK</h3>

					<hr class="hr">

					<form action=author method="post" enctype="multipart/form-data">
					<input type="hidden" name="operation" value="book">
						<%@include file="aleart.jsp"%>
						<div class="form-row">
							<div class="form-group col-md-6 ">
								<label class="label" for="inputEmail4">Enter Book Tile</label> <input
									 type="text" class="form-control" id="inputEmail4"
									 placeholder="Enter Book Title" name="bname"
											required="required">
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Enter Publish Date</label> <input
									 type="date" class="form-control"
									id="inputPassword4" placeholder="Enter Publish date" name="bdate"
											required="required">
							</div>
						</div>
						<div class="form-row">
							<div class="form-group col-md-6 ">
								<label class="label" for="inputEmail4">Enter Book Page
									Quatntity</label> <input type="text" class="form-control"
									id="inputEmail4" placeholder="Enter Book Page Quantity"
											name="bpage" required="required">
							</div>
							<div class="form-group col-md-6">
								<label for="inputAddress">Enter Book Price</label> <input
									type="text" class="form-control" id="inputAddress"
									placeholder="Enter Book Price" name="bmrp"
											required="required">
							</div>

						</div>
						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputAddress">Written By</label> <input type="text"
									class="form-control" id="inputAddress"
									placeholder="Written By" name="written" required="required">
							</div>

							<div class="form-group col-md-6">
								<label for="inputAddress">Book Image</label> <input type="file"
									class="form-control" id="inputAddress" name="pimg"
									required="required">
									<p style="font: italic; color: red">Note- *Only jpeg Format max Size- 5MB</p>
							</div>

						</div>
						<div class="form-row">

							<div class="form-group col-md-6">
								<label for="inputAddress">Add Book Docx FILE</label> <input
									type="file" class="form-control" id="inputAddress"
									placeholder="Enter PDF" required="required"
									name="pdf">
									<p style="font: italic; color: red">Note- *Only DOCX Format max Size- 10MB</p>
							</div>
							<div class="form-group col-md-6">
								<label for="inputAddress">Select Categories</label> <select
									class="form-control" name="categories">
									<%
										CategorieDao cdao = new CategorieDao(FactoryProvider.getFactory());
										List<Categories> list = cdao.getcategories();
									%>
									<%
										for (Categories c : list) {
									%>
									<option value="<%=c.getId()%>"><%=c.getAname()%></option>

									<%
										}
									%>

								</select>
							</div>
						</div>
						<div class="container text-center">
							<button type="submit" class="btn btn-outline-warning">Add
								Book</button>
							<button type="reset" class="btn btn-outline-primary">
								Reset</a>
						</div>

					</form>
				</div>

			</div>
		</div>

	</div>


</body>
</html>