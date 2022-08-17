<!-- Button trigger modal -->

<%@page import="com.book.entity.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.book.dao.BookDao"%>
<%@page import="com.book.helper.FactoryProvider"%>
<%

BookDao bd = new BookDao(FactoryProvider.getFactory());

List<Book> blist= bd.getAllProducts();

%>

<%


BookDao bookdao = new BookDao(FactoryProvider.getFactory());
String a = request.getParameter("all");

%>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Books</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        			<div class="table-responsive">
					
					<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Book Name</th>
      <th scope="col">Book page</th>
      <th scope="col">Book Price</th>
      <th scope="col">Publish date</th>
       <th scope="col">Options</th>
    </tr>
  </thead>
  <tbody>
  <%
								for (Book book : blist) {
									 
							%>
 
    <tr>
      <th scope="row"><%=book.getBid() %></th>
      <td><%=book.getBname() %></td>
      <td><%=book.getBpage() %></td>
      <td><%=book.getBmrp()%></td>
      <td><%=book.getBpublisheddate()%></td>
      <td><a href="updatedeletebook.jsp?id=<%=book.getBid()%>" ><img style="max-width: 30px;"
							src="images/delete.png"></a></td>
    </tr>
    <%} %>
  
  </tbody>
</table>
					
					
				</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
       
      </div>
    </div>
  </div>
</div>