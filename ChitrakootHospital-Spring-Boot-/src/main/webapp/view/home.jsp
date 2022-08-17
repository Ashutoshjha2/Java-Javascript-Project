
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<html lang="en">


<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Home</title>
<link rel="shortcut icon" type="image/x-icon" href="images/favicon.png" />
<link rel="stylesheet" href="plugin/bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="plugin/bootstrap/css/bootstrap-theme.css">
<link rel="stylesheet" href="fonts/poppins/poppins.css">
<link rel="stylesheet"
	href="plugin/fonts/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="plugin/jquery-ui/jquery-ui.min.css">
<link rel="stylesheet" href="plugin/process-bar/tox-progress.css">
<link rel="stylesheet" href="plugin/owl-carouse/owl.carousel.min.css">
<link rel="stylesheet"
	href="plugin/owl-carouse/owl.theme.default.min.css">
<link rel="stylesheet" href="plugin/animsition/css/animate.css">
<link rel="stylesheet" href="plugin/jquery-ui/jquery-ui.min.css">
<link rel="stylesheet" href="plugin/mediaelement/mediaelementplayer.css">
<link rel="stylesheet"
	href="plugin/datetimepicker/bootstrap-datepicker3.css">
<link rel="stylesheet"
	href="plugin/datetimepicker/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="plugin/lightgallery/lightgallery.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>


	<!--load page-->
	<div class="load-page">
		<div class="sk-wave">
			<div class="sk-rect sk-rect1"></div>
			<div class="sk-rect sk-rect2"></div>
			<div class="sk-rect sk-rect3"></div>
			<div class="sk-rect sk-rect4"></div>
			<div class="sk-rect sk-rect5"></div>
		</div>
	</div>

	<!-- Mobile nav -->
	<nav class="visible-sm visible-xs mobile-menu-container mobile-nav">
		<div class="menu-mobile-nav navbar-toggle">
			<span class="icon-bar"><i class="fa fa-bars"
				aria-hidden="true"></i></span>
		</div>
		<div id="cssmenu" class="animated">
			<div class="uni-icons-close">
				<i class="fa fa-times" aria-hidden="true"></i>
			</div>
			<ul class="nav navbar-nav animated">
				<li class="has-sub"><a
					href="${pageContext.request.contextPath }/home">Home</a></li>
				<li><a href="${pageContext.request.contextPath }/login">Login</a></li>
				<li><a href="${pageContext.request.contextPath }/service">Services</a></li>
				<li><a href="${pageContext.request.contextPath }/about">About</a></li>

				<li><a href="${pageContext.request.contextPath }/contact">Contacts</a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
	</nav>
	<!-- End mobile menu -->

	<div class="uni-home-1">
		<div id="wrapper-container" class="site-wrapper-container">
			<header>
				<div class="uni-medicare-header sticky-menu">
					<div class="container">
						<div class="uni-medicare-header-main">
							<div class="row">
								<div class="col-md-2">
									<!--LOGO-->
									<div class="wrapper-logo">
										<a class="logo-default" href="#"><img
											src="images/logohospital.png" width="95px;" alt=""
											class="img-responsive"></a>
										<h3 style="color: lightblue; font-size: 25px;">Chitrakoot
											Hospital</h3>
										<div class="clearfix"></div>
									</div>
								</div>
								<div class="col-md-10">
									<!--MENU TEXT-->

									<div class="uni-main-menu"
										style="color: yellow; font-size: 30px;">
										<nav class="main-navigation uni-menu-text">
											<div class="cssmenu">
												<ul>

													<li><a href="${pageContext.request.contextPath }/home">Home</a></li>

													<li><a
														href="${pageContext.request.contextPath }/login">Login</a></li>
													<li><a
														href="${pageContext.request.contextPath }/service">Services</a></li>
													<li><a
														href="${pageContext.request.contextPath }/about">About</a></li>

													<li><a
														href="${pageContext.request.contextPath }/contact">Contacts</a></li>

												</ul>
											</div>
										</nav>
									</div>

									<!--SEARCH AND APPOINTMENT-->
									<div class="uni-search-appointment">
										<ul>
											<li class="un-btn-search"><i class="fa fa-search"
												aria-hidden="true"></i></li>
												<%@include file="emergency.jsp" %>
											<li class="uni-btn-appointment"><a href="" data-toggle="modal" data-target="#exampleModalCenter" style="background: black; color: red;">Emergency</a>
											</li>
										</ul>
									</div>
								</div>
							</div>



							<!--FORM SEARCH-->
							<div class="uni-form-search-header">
								<div class="box-search-header collapse" id="box-search-header">
									<div class="uni-input-group">
										<input type="text" name="key" placeholder="Search"
											class="form-control">
										<button class="uni-btn btn-search">
											<i class="fa fa-long-arrow-right" aria-hidden="true"></i>
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</header>

			<div id="main-content" class="site-main-content">
				<section class="site-content-area">

					<!--BANNER-->
					<div class="uni-banner">
						<div class="uni-owl-one-item owl-carousel owl-theme">
							<div class="item">
								<div class="uni-banner-img uni-background-5"></div>
								<div class="content animated" data-animation="flipInX"
									data-delay="0.9s">
									<div class="container">
										<div class="caption">
											<h1>Welcome Chitrakoot Hospital</h1>
											<p class="text-center">
												Let us protect your health <br> Visit My Hospital
											</p>

										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="uni-banner-img uni-background-6"></div>
								<div class="content animated" data-animation="flipInX"
									data-delay="0.9s">
									<div class="container">
										<div class="caption">
											<h1>Welcome Chitrakoot Hospital</h1>
											<p>
												Let us protect your health <br> Visit My Hospital
											</p>

										</div>
									</div>
								</div>
							</div>
							<div class="item">
								<div class="uni-banner-img uni-background-7"></div>
								<div class="content animated" data-animation="flipInX"
									data-delay="0.9s">
									<div class="container">
										<div class="caption">
											<h1>Welcome Chitrakoot Hospital</h1>
											<p>
												Let us protect your health <br> Visit My Hospital
											</p>

										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--OPENING HOURS AND BOOK APPOINTMENT-->
					<div class="uni-home-opening-book">
						<div class="container">
							<div class="uni-home-opening-book-content">
								<div class="row">
									<div class="col-md-4">
										<div class="uni-services-opinging-hours">
											<div class="uni-services-opinging-hours-title">
												<div class="icon">
													<i class="fa fa-clock-o" aria-hidden="true"></i>
												</div>
												<h4>opening hours</h4>
											</div>
											<div class="uni-services-opinging-hours-content">
												<table class="table">
													<tr>
														<td>monday</td>
														<td>8:00 - 17:00</td>
													</tr>
													<tr>
														<td>tuesday</td>
														<td>8:00 - 17:00</td>
													</tr>
													<tr>
														<td>wednesday</td>
														<td>8:00 - 17:00</td>
													</tr>
													<tr>
														<td>thursday</td>
														<td>8:00 - 17:00</td>
													</tr>
													<tr>
														<td>friday</td>
														<td>8:00 - 17:00</td>
													</tr>
													<tr>
														<td>sunday</td>
														<td>8:00 - 17:00</td>
													</tr>
												</table>
											</div>
										</div>
									</div>
									<div class="col-md-8">
										<div class="uni-single-department-appointment-form">

											<div class="uni-home-title">
												<h3>Book appoitment</h3>
												<div class="uni-underline"></div>
											</div>

											<form action="appointment" method="post">
												<div class="row">
													<div class="col-md-5">
														<div class="input-group form-group">
															<span class="input-group-addon"><i
																class="fa fa-user" aria-hidden="true"></i></span> <input
																type="text" class="form-control" name="name" value=""
																placeholder="your name" required="required">
														</div>
														<div class="input-group form-group">
															<span class="input-group-addon"><i
																class="fa fa-phone" aria-hidden="true"></i></span> <input
																type="tel" class="form-control" name="phone" value=""
																placeholder="phone number" required="required">
														</div>
														<div class="input-group form-group">
															<span class="input-group-addon"><i
																class="fa fa-envelope" aria-hidden="true"></i></span> <input
																type="email" class="form-control" name="email" value=""
																placeholder="email" required="required">
														</div>
														<div class="input-group form-group">
															<div class="input-group date date-check-in"
																data-date="12-02-2017" data-date-format="mm-dd-yyyy">
																<span class="input-group-addon"><i
																	class="fa fa-calendar" aria-hidden="true"></i></span> <input
																	name="date1" class="form-control" type="text"
																	value="12-02-2017" required="required"> <span
																	class="input-group-addon btn"><i
																	class="fa fa-calendar" id="ti-calendar1"
																	aria-hidden="true"></i></span>
															</div>
														</div>
													</div>
													<div class="col-md-7">
														<div class="input-group form-group">
															<textarea id="message" name="msg" class="form-control"
																placeholder="Enter Short note" required="required"></textarea>
														</div>
														<button class="vk-btn vk-btn-send">Book Now</button>
													</div>
												</div>
											</form>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>


					<!--DEPARTMENT-->
					<div class="uni-hơm-1-department">
						<div class="container">
							<div class="uni-home-title">
								<h3>Department</h3>
								<div class="uni-underline"></div>
							</div>
							<div class="uni-shortcode-icon-box-1">
								<div class="row">
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icon-box-1-default">
											<div class="item-icons">
												<img src="images/icons_box/icon_1/icon-5.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<h4>cardiology</h4>
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas adipisicing.</p>
											</div>
										</div>
									</div>

									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icon-box-1-default">
											<div class="item-icons">
												<img src="images/icons_box/icon_1/icon-4.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<h4>Neurology</h4>
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas adipisicing.</p>
											</div>
										</div>
									</div>

									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icon-box-1-default">
											<div class="item-icons">
												<img src="images/icons_box/icon_1/icon-3.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<h4>Orthopedics</h4>
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas adipisicing.</p>
											</div>
										</div>
									</div>

									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icon-box-1-default">
											<div class="item-icons">
												<img src="images/icons_box/icon_1/icon-2.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<h4>cancer department</h4>
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas adipisicing.</p>
											</div>
										</div>
									</div>

									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icon-box-1-default">
											<div class="item-icons">
												<img src="images/icons_box/icon_1/icon-1.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<h4>Ophthalmology</h4>
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas adipisicing.</p>
											</div>
										</div>
									</div>

									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icon-box-1-default">
											<div class="item-icons">
												<img src="images/icons_box/icon_1/icon.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<h4>Respiratory</h4>
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas adipisicing.</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

					<!--OUR DOCTOR-->
					<div class="uni-home-1-our-doctor">
						<div class="uni-shortcode-team-2 uni-background-2">
							<div class="container">

								<div class="uni-home-title">
									<h3>Our Doctor</h3>
									<div class="uni-underline"></div>
								</div>

								<div class="uni-owl-four-item owl-carousel owl-theme">
									<div class="item">
										<div class="uni-team-default">
											<div class="item-img">
												<img src="images/team/img.png" alt="" class="img-responsive">
											</div>
											<div class="item-caption">
												<div class="col-md-3 col-sm-3 col-xs-3 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-5.png" alt="">
													</div>
												</div>
												<div class="col-md-9 col-sm-9 col-xs-9 uni-clear-padding">
													<div class="item-title">
														<h4>adam jonson</h4>
														<span>Cardiologist</span>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="item">
										<div class="uni-team-default">
											<div class="item-img">
												<img src="images/team/img1.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<div class="col-md-3 col-sm-3 col-xs-3 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-4.png" alt="">
													</div>
												</div>
												<div class="col-md-9 col-sm-9 col-xs-9 uni-clear-padding">
													<div class="item-title">
														<h4>Henrik larssom</h4>
														<span>neurologist</span>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="item">
										<div class="uni-team-default">
											<div class="item-img">
												<img src="images/team/img2.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<div class="col-md-3 col-sm-3 col-xs-3 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-3.png" alt="">
													</div>
												</div>
												<div class="col-md-9 col-sm-9 col-xs-9 uni-clear-padding">
													<div class="item-title">
														<h4>amanda smith</h4>
														<span>Ophthalmology doctor</span>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="item">
										<div class="uni-team-default">
											<div class="item-img">
												<img src="images/team/img3.png" alt=""
													class="img-responsive">
											</div>
											<div class="item-caption">
												<div class="col-md-3 col-sm-3 col-xs-3 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-2.png" alt="">
													</div>
												</div>
												<div class="col-md-9 col-sm-9 col-xs-9 uni-clear-padding">
													<div class="item-title">
														<h4>david martin</h4>
														<span>Cancer doctor</span>
													</div>
												</div>
											</div>
										</div>
									</div>


								</div>
							</div>
						</div>
					</div>


					<!--OUR SERVICES-->
					<div class="uni-home-our-services">
						<div class="uni-shortcode-icons-box-5">
							<div class="container">

								<div class="uni-home-title">
									<h3>Our Services</h3>
									<div class="uni-underline"></div>
								</div>

								<div class="row">
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icons-box-5-default">
											<div class="item-icons-title">
												<div class="col-md-4 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-5.png" alt="">
													</div>
												</div>
												<div class="col-md-8 uni-clear-padding">
													<div class="item-title">
														<h4>Corneal transplant surgery</h4>
													</div>
												</div>
											</div>
											<div class="item-caption">
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas. Vestibulum
													tortor quam, feugiat vitae, ultricies eget...</p>
												<a href="#" class="readmore">Read more</a>
											</div>
										</div>
									</div>
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icons-box-5-default">
											<div class="item-icons-title">
												<div class="col-md-4 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-4.png" alt="">
													</div>
												</div>
												<div class="col-md-8 uni-clear-padding">
													<div class="item-title">
														<h4>Cardiothoracic Surgery</h4>
													</div>
												</div>
											</div>
											<div class="item-caption">
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas. Vestibulum
													tortor quam, feugiat vitae, ultricies eget...</p>
												<a href="#" class="readmore">Read more</a>
											</div>
										</div>
									</div>
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icons-box-5-default">
											<div class="item-icons-title">
												<div class="col-md-4 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-3.png" alt="">
													</div>
												</div>
												<div class="col-md-8 uni-clear-padding">
													<div class="item-title">
														<h4>General health check</h4>
													</div>
												</div>
											</div>
											<div class="item-caption">
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas. Vestibulum
													tortor quam, feugiat vitae, ultricies eget...</p>
												<a href="#" class="readmore">Read more</a>
											</div>
										</div>
									</div>
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icons-box-5-default">
											<div class="item-icons-title">
												<div class="col-md-4 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-2.png" alt="">
													</div>
												</div>
												<div class="col-md-8 uni-clear-padding">
													<div class="item-title">
														<h4>
															Diagnosis &amp; <br> treatment of cancer
														</h4>
													</div>
												</div>
											</div>
											<div class="item-caption">
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas. Vestibulum
													tortor quam, feugiat vitae, ultricies eget...</p>
												<a href="#" class="readmore">Read more</a>
											</div>
										</div>
									</div>
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icons-box-5-default">
											<div class="item-icons-title">
												<div class="col-md-4 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon-1.png" alt="">
													</div>
												</div>
												<div class="col-md-8 uni-clear-padding">
													<div class="item-title">
														<h4>
															treatment of <br> pneumonia
														</h4>
													</div>
												</div>
											</div>
											<div class="item-caption">
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas. Vestibulum
													tortor quam, feugiat vitae, ultricies eget...</p>
												<a href="#" class="readmore">Read more</a>
											</div>
										</div>
									</div>
									<div class="col-md-4 col-sm-6">
										<div class="uni-shortcode-icons-box-5-default">
											<div class="item-icons-title">
												<div class="col-md-4 uni-clear-padding">
													<div class="item-icons">
														<img src="images/icons_box/icon_4/icon.png" alt="">
													</div>
												</div>
												<div class="col-md-8 uni-clear-padding">
													<div class="item-title">
														<h4>
															Treatment of <br> dermatitis
														</h4>
													</div>
												</div>
											</div>
											<div class="item-caption">
												<p>Pellentesque habitant morbi tristique senectus et
													netus et malesuada fames ac turpis egestas. Vestibulum
													tortor quam, feugiat vitae, ultricies eget...</p>
												<a href="#" class="readmore">Read more</a>
											</div>
										</div>
									</div>
								</div>

								<div class="btn-all-services">
									<a href="#">All services +</a>
								</div>

							</div>
						</div>
					</div>

					<!--MAP-->
					<div class="uni-home-map">
						<div class="uni-about-map">
							<iframe class="map"
								src="https://maps.google.com/maps?q=up%20tourist%20chitrakoot&t=&z=13&ie=UTF8&iwloc=&output=embed"
								height="700" style="border: 0"></iframe>
						</div>
					</div>


				</section>
			</div>

			<footer class="site-footer footer-default">
				<div class="footer-main-content">
					<div class="container">
						<div class="row">
							<div class="footer-main-content-elements">
								<div class="footer-main-content-element col-md-3 col-sm-6">
									<aside class="widget">
										<div class="widget-title uni-uppercase">
											<a href="#"><img src="images/logohospital.png"
												width="70px;" alt="" class="img-responsive"></a>
										</div>
										<div class="widget-content">
											<p>Pellentesque habitant morbi tristique senectus et
												netus et malesuada fame ac turpis egestas. Vestibulum tortor
												quam, feugiat vitae, ultricies eget.</p>
											<div class="uni-info-contact">
												<ul>
													<li><i class="fa fa-map-marker" aria-hidden="true"></i>
														Malkana Road Sitapur,Chitakoot</li>
													<li><i class="fa fa-phone" aria-hidden="true"></i> +91
														1234567890</li>
													<li><i class="fa fa-envelope-o" aria-hidden="true"></i>
														chitakoothospital@gmail.com</li>
												</ul>
											</div>
										</div>
									</aside>
								</div>
								<div class="footer-main-content-element col-md-3 col-sm-6">
									<aside class="widget">
										<h3 class="widget-title uni-uppercase">quick links</h3>
										<div class="widget-content">
											<div class="uni-quick-link">
												<ul>
													<li><a href="${pageContext.request.contextPath }/home"><span>+</span>
															Home</a></li>
													<li><a
														href="${pageContext.request.contextPath }/about"><span>+</span>
															about</a></li>
													<li><a
														href="${pageContext.request.contextPath }/service"><span>+</span>
															services</a></li>
													<li><a
														href="${pageContext.request.contextPath }/contact"><span>+</span>
															contact</a></li>
												</ul>
											</div>
										</div>
									</aside>
								</div>
								<div class="footer-main-content-element col-md-3 col-sm-6">
								</div>
								<div class="footer-main-content-element col-md-3 col-sm-6">

								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="copyright-area">
					<div class="container">
						<div class="copyright-content">
							<div class="row">
								<div class="col-sm-6">
									<p class="copyright-text">
										<a href="#">Chitrakoot Hospital</a>
									</p>
								</div>
								<div class="col-sm-6">
									<ul class="copyright-menu">
										<li><a href="#">Term Of Use</a></li>
										<li><a href="#">Privacy Policy</a></li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</footer>
		</div>
	</div>
	<script src="plugin/jquery/jquery-2.0.2.min.js"></script>
	<script src="plugin/jquery-ui/jquery-ui.min.js"></script>
	<script src="plugin/bootstrap/js/bootstrap.js"></script>
	<script src="plugin/process-bar/tox-progress.js"></script>
	<script src="plugin/waypoint/jquery.waypoints.min.js"></script>
	<script src="plugin/counterup/jquery.counterup.min.js"></script>
	<script src="plugin/owl-carouse/owl.carousel.min.js"></script>
	<script src="plugin/jquery-ui/jquery-ui.min.js"></script>
	<script src="plugin/mediaelement/mediaelement-and-player.js"></script>
	<script src="plugin/masonry/masonry.pkgd.min.js"></script>
	<script src="plugin/datetimepicker/moment.min.js"></script>
	<script src="plugin/datetimepicker/bootstrap-datepicker.min.js"></script>
	<script src="plugin/datetimepicker/bootstrap-datepicker.tr.min.js"></script>
	<script src="plugin/datetimepicker/bootstrap-datetimepicker.js"></script>
	<script src="plugin/datetimepicker/bootstrap-datetimepicker.fr.js"></script>

	<script src="plugin/lightgallery/picturefill.min.js"></script>
	<script src="plugin/lightgallery/lightgallery.js"></script>
	<script src="plugin/lightgallery/lg-pager.js"></script>
	<script src="plugin/lightgallery/lg-autoplay.js"></script>
	<script src="plugin/lightgallery/lg-fullscreen.js"></script>
	<script src="plugin/lightgallery/lg-zoom.js"></script>
	<script src="plugin/lightgallery/lg-hash.js"></script>
	<script src="plugin/lightgallery/lg-share.js"></script>
	<script src="plugin/sticky/jquery.sticky.js"></script>

	<script src="js/main.js"></script>
</body>


</html>

