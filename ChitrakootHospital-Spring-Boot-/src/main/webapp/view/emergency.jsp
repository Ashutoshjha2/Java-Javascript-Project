<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
h5{

animation-duration:3s;
animation-name:update;
animation-iteration-count:infinite;
animation-direction:alternate;
}
#i1{



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
<!-- Modal -->
<div class="modal fade-modal-lg" id="exampleModalCenter" tabindex="-1"
	role="dialog" aria-labelledby="exampleModalCenterTitle"
	aria-hidden="true">
	<div class="modal-dialog  modal-lg" role="document">
		<div class="modal-content">
			<div class="modal-header" >
				
				<div class="container text-center">
				
				<h3 class="modal-title" id="exampleModalLongTitle" style="color: rgb(52, 220, 210);">Emergency Service Ambulance</h3>
				<p style="color: rgb(52, 220, 134); font-size: 20px;">Dial 108 Quick Ambulance <br>
				<a style="color: rgb(52, 70, 95);font-size: 18px; " class="fa fa-phone" href="${pageContext.request.contextPath }/voicecall"> Click Here To Call</a> </p>
				
				</div>
	
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body" style="background: rgb(150, 177, 145);">
				<h6 style="color: rgb(52, 70, 95);" class="container text-center">Free Ambulance For Referral Condition Patient</h6>
				<p class="container text-center">
					<a href="${pageContext.request.contextPath }/emergency" role="button"
						class="btn btn-warning popover-test" title="Popover title"
						data-content="Popover body content is set in this attribute.">Book Now</a>
				<% session.setAttribute("round", "round"); %>
					<i id="i1" style="color: red;">*This Service Provide Only Refer Patient</i>
				</p>
				<hr>
				
			</div>
			
		</div>
	</div>
</div>