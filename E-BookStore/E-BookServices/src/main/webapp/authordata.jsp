
<%@page import="java.util.List"%>
<%@page import="com.book.dao.AuthorDao"%>
<%@page import="com.book.entity.Registration"%>
<%@page import="com.book.helper.FactoryProvider"%>
<%
AuthorDao ad1 = new AuthorDao(FactoryProvider.getFactory());
List<Registration> list1= ad1.getallauthor("author");

%>


<!-- Modal -->
<div class="modal fade" id="exampleModal-lg" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Author Details</h5>
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
      <th scope="col">Name</th>
      <th scope="col">Address</th>
      <th scope="col">Phone No.</th>
      <th scope="col">Email Id</th>
    </tr>
  </thead>
  <tbody>
 <%
								for (Registration reg : list1) {
									
							%>
    <tr>
      <th scope="row"><%=reg.getId() %></th>
      <td><%=reg.getUname() %></td>
      <td><%=reg.getAddress() %></td>
      <td><%=reg.getMobile() %></td>
      <td><%=reg.getEmail() %></td>
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