<%@page import="java.util.List"%>
<%@page import="com.book.dao.ReaderDao"%>
<%@page import="com.book.entity.Registration"%>
<%@page import="com.book.helper.FactoryProvider"%>

<%
String cust ="reader";
ReaderDao rd = new ReaderDao(FactoryProvider.getFactory());
List<Registration> list = rd.getallreader(cust);

%>
<!-- Large modal -->


<div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog"
	aria-labelledby="myLargeModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Reader Data</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
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
								for (Registration reg : list) {
									list.size();
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