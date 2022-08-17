
<%@page import="com.book.entity.Categories"%>
<%@page import="com.book.dao.CategorieDao"%>
<%@page import="com.book.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.book.dao.BookDao"%>
<%@page import="com.book.helper.FactoryProvider"%>
<%@page import="com.book.dao.CategorieDao"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<%@include file="common_model.jsp"%>
<%@include file="common.jsp"%>
<title>E-Book Service</title>
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
	<div class="container mt-4 ">
	
	<p><%@include file="header.jsp" %></p>
	
	<h5 style="font: italic; color:fuchsia; ; ">*Up Coming Updates*</h5><marquee behavior="alternate" scrollamount="5" ><p style="font: italic; color: red">Coming Soon ? PDF Format Download Book - <i style="font: italic; color:navy;">Download Book Docx format </i><i style="font: italic; color: green;"> - This Is College Project : Using All Data is Dummy  </i></p>
		
		
		
		
		</marquee>
	
			
			 <p><%@include file="navbar.jsp" %></p>

				
		<div class="row mt-4">
			<!-- show categories -->
			
						 <%
				
						        BookDao dao = new BookDao(FactoryProvider.getFactory());
								List<Book> list = null;
								String cat = request.getParameter("category");
								if(cat==null || cat.trim().equals("all"))
								{
									
									list=dao.getAllProducts();
									
								}else{
									int cid = Integer.parseInt(cat.trim());
									list=dao.getAllProductById(cid);
									
								}
									
								

								CategorieDao dao2 = new CategorieDao(FactoryProvider.getFactory());
								List<Categories> list2 = dao2.getcategories();
			%>
			<div class="col-md-2">
				<div class="list-group ">
					<a href="index.jsp?category=all"
						class="list-group-item list-group-item-action active"> All Books
						 </a>

                    <%
						for (Categories categories : list2) {
					%>
					<a href="index.jsp?category=<%=categories.getId()%>"
						class="list-group-item list-group-item-action cat-item"><%=categories.getAname()%></a>


					<%
						}
					%>

				</div>
			</div>

			<!-- 		products      -->

			<div class="col-md-10">
				<div class="row mt-1 ">
					<div class="col md-12">
						<div class="card-columns">
							
<%
								for (Book product : list) {
							%>

							<div class="card product-cart">
							
								<div class="card-header"><%=product.getBname()%></div>
									<div class="card-body">
										<img class="card-img-top m-2"
											src="images/product/<%=product.getBimg()%>"
											style="max-height: 150px; max-width: 120px; width: auto;"
											alt="">
										<p class="card-text">

                                    Publish date- <%=product.getBpublisheddate() %><hr>
								   
								    Written By- <%=product.getWritten() %>
										</p>
                                   
                                   
									</div>
									<div class="card-footer">
										<button class="btn btn-outline-warning" ><a href="images/product/<%=product.getPdf()%>">Download Now</a></button></form>
										
										
<hr>										<div>
										<form action="checkout.jsp" method="post">
										<input type="hidden" name="bimg" value="<%=product.getBimg()%>">
										<input type="hidden" name="bname" value="<%=product.getBname() %>"> 
										<input type="hidden" name="bid" value="<%=product.getBid() %>"> 
										<input type="hidden" name="bmrp" value="<%=product.getBmrp() %>"> 
										<input type="hidden" name="bpage" value="<%=product.getBpage() %>"> 
										<input type="hidden" name="bwritten" value="<%=product.getWritten() %>"> 
										<button class="btn btn-outline-primary" type="submit">Buy Now
										</button>
										</form>
										</div>
									</div>
								
							</div>
							
							
							
  <%
								}
							%>
							
							
							
						</div>

					</div>
				</div>


			</div>

		</div>
		
</body>
</html>



