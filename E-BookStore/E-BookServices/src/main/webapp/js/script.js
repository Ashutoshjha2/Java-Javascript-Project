
function add_to_cart(pid,pname,price,bv) {
	
	let cart = localStorage.getItem("cart");
	
	if (cart == null) {
		// no cart yest
		let Products=[];
		let Product ={ProductId:pid,ProductName:pname,ProductQuantity:1,ProductPrice:price,ProductBv:bv}
	    Products.push(Product);
		localStorage.setItem("cart",JSON.stringify(Products));
		console.log("Product added first time ");
	}else {
		// cart is already present
		let pcart=JSON.parse(cart);
		let oldProduct = pcart.find((item)=>item.ProductId==pid)
		if (oldProduct) {
			
			// we have increse size
			
			console.log("Product increse quantity")
		oldProduct.ProductQuantity	 = oldProduct.ProductQuantity+1
			pcart.map((item)=>{
				
				if(item.productId == oldProduct.ProductId)
					{
					item.ProductQuantity = oldProduct.ProductQuantity;
					}
			})
			 localStorage.setItem("cart",JSON.stringify(pcart));
		}else {
			// we have add the product
			let Product ={ProductId:pid,ProductName:pname,ProductQuantity:1,ProductPrice:price,ProductBv:bv}
		   pcart.push(Product)
		   localStorage.setItem("cart",JSON.stringify(pcart));
			console.log()
		}
	}
	
	updateCart()
}
// update Cart

function updateCart() {
	
	let cartString =localStorage.getItem("cart");
	let cart=JSON.parse(cartString);
	if (cart==null || cart.length==0) {
		console.log("Cart is empty ::!!")
		  $(".cart-item").html( "(0)");
		  $(".cart-body").html("<h3 class='alert alert-danger'>Cart Empty!!</h3>");
		  $(".checkout-btn").attr("disabled",true)
	}else {
		// there is some is cart to show
		 $(".cart-item").html( `(${cart.length})`);
		 let table =`
		<table class ='table  table-hover'>
		 <thead class='thead-dark'>
		 <tr>
		 <th>Item Name</th>
		 <th>Price</th>
		
		 <th>Quantity</th>
		 <th>Total Price</th>
		 
		 <th>Action</th>
		 </tr>
		 </thead>
		 `
		 ;
		 let totalPrice =0;
		 let totalBv =0;
		 cart.map((item)=>{
			 
			 
			 table +=`
			 
			  <tr>
			  <td>${item.ProductName}</td>
			  <td><i class="fa fa-inr">${item.ProductPrice}</i></td>
			  <td>${item.ProductQuantity}</td>
			  <td><i class="fa fa-inr">${item.ProductQuantity*item.ProductPrice}</i></td>
			
			   <td><button onclick='deleteItemFormCart(${item.ProductId})' class ='btn btn-outline-danger btn-sm'>Remove</button>
			</tr>
			 
			 `
				 totalPrice+=item.ProductQuantity*item.ProductPrice;
			   totalBv+=item.ProductQuantity*item.ProductBv;
		 })
		   
		 table = table+`
		 
		  <tr><td colspan='3' class='text-right font-weight-bold '> Total-Amount:- <i class="fa fa-inr text-right font-weight-bold">${totalPrice}<i></td><td><td colspan='2' class='text-right font-weight-bold'>Total-Bv:- ${totalBv}</td></tr>
		  
		 
		 </table>`
		 
		 $(".cart-body").html(table);
		 $(".checkout-btn").attr("disabled",false)
	}
	
}

// delete item
function deleteItemFormCart(pid) {
	
	let cart =JSON.parse(localStorage.getItem('cart'));
   let newcart= cart.filter((item)=>item.ProductId!=pid)
    
   localStorage.setItem('cart',JSON.stringify(newcart))
   
   updateCart()

}
$(document).ready(function () {
	updateCart()
	
})

function gotocheckout() {
	window.location="checkout.jsp"
		
	
}

