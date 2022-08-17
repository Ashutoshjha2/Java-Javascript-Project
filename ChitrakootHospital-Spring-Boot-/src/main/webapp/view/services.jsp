<!doctype html>
<html lang="en">

<!-- 03_01_services.html  [XR&CO'2014], Tue, 22 Oct 2019 11:55:26 GMT -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>services</title>
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
				<li><a href="" data-toggle="modal" data-target="#exampleModal">Login</a></li>
				<li><a href="${pageContext.request.contextPath }/service">Services</a></li>
				<li><a href="${pageContext.request.contextPath }/about">About</a></li>

				<li><a href="${pageContext.request.contextPath }/contact">Contacts</a></li>
			</ul>
			<div class="clearfix"></div>
		</div>
	</nav>
	<!-- End mobile menu -->

	<div class="uni-services">
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
									<div class="uni-main-menu">
										<nav class="main-navigation uni-menu-text">
											<div class="cssmenu">
												<ul>
													<li><a href="${pageContext.request.contextPath }/home">Home</a></li>

													<li><a href="${pageContext.request.contextPath }/login" >Login</a></li>
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

							<!--SHORTCODE-->
							<!--END SHORTCODE-->

							<!--FORM SEARCH-->
							<div class="uni-form-search-header">
								<div class="box-search-header collapse in"
									id="box-search-header">
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

					<div class="uni-banner-default uni-background-1">
						<div class="container">
							<!-- Page title -->
							<div class="page-title">
								<div class="page-title-inner">
									<h1>services</h1>
								</div>
							</div>
							<!-- End page title -->

							<!-- Breadcrumbs -->
							<ul class="breadcrumbs">
								<li><a href="#">home</a></li>
								<li><a href="#">services</a></li>
							</ul>
							<!-- End breadcrumbs -->
						</div>
					</div>

					<div class="uni-services-body">

						<!--OUR SERVICES 1-->
						<div class="uni-our-services-1">
							<div class="container">
								<div class="uni-services-title">
									<h3>Our services</h3>
									<div class="uni-underline"></div>
								</div>
							</div>
							<div class="uni-shortcode-icons-box-5">
								<div class="container">
									<div class="row">
										<div class="col-md-4">
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
										<div class="col-md-4">
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
										<div class="col-md-4">
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
										<div class="col-md-4">
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
																Diagnosis & <br> treatment of cancer
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
										<div class="col-md-4">
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
										<div class="col-md-4">
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
								</div>
							</div>
						</div>

						<!--OUR SERVICES 2-->
						<div class="uni-our-services-2 uni-background-4">
							<div class="container">
								<div class="uni-services-title">
									<h3>Our services</h3>
									<div class="uni-underline"></div>
								</div>

								<div class="uni-our-service-2-body">
									<div class="row">
										<div class="col-md-3">
											<div class="tab-nav">
												<ul class="nav-pills nav-stacked">
													<li class="active"><a href="#tab_a" data-toggle="pill">Cardiothoracic
															Surgery</a></li>
													<li><a href="#tab_b" data-toggle="pill">Corneal
															transplant surgery</a></li>
													<li><a href="#tab_c" data-toggle="pill">General
															health check</a></li>
													<li><a href="#tab_d" data-toggle="pill">Diagnosis
															& treatment cancer</a></li>
													<li><a href="#tab_e" data-toggle="pill">Treatment
															of dermatitis</a></li>
												</ul>
											</div>
										</div>
										<div class="col-md-9">
											<div class="tab-content">
												<div class="tab-pane active" id="tab_a">
													<div class="uni-our-service-2-content-default">
														<div class="row">
															<div class="col-md-5">
																<div class="item-img">
																	<img src="images/services/img.jpg" alt=""
																		class="img-responsive">
																</div>
															</div>
															<div class="col-md-7">
																<div class="item-caption">
																	<div class="item-caption-title">
																		<h3>Cardiothoracic Surgery</h3>
																		<div class="uni-line"></div>
																	</div>
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget,
																		tempor sit amet, ante. Donec eu libero sit amet quam
																		egestas semper. Aenean ultricies mi vitae est. Mauris
																		placerat eleifend leo.</p>
																	<ul>
																		<li>Lorem ipsum dolor sit amet, consectetuer</li>
																		<li>Aliquam tincidunt mauris eu risus</li>
																		<li>Vestibulum auctor dapibus neque</li>
																		<li>Morbi in sem quis dui placerat ornare</li>
																		<li>Donec eu libero sit amet quam egestas semper
																		</li>
																	</ul>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="tab-pane" id="tab_b">
													<div class="uni-our-service-2-content-default">
														<div class="row">
															<div class="col-md-5">
																<div class="item-img">
																	<img src="images/services/img1.jpg" alt=""
																		class="img-responsive">
																</div>
															</div>
															<div class="col-md-7">
																<div class="item-caption">
																	<div class="item-caption-title">
																		<h3>Corneal transplant surgery</h3>
																		<div class="uni-line"></div>
																	</div>
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget,
																		tempor sit amet, ante. Donec eu libero sit amet quam
																		egestas semper. Aenean ultricies mi vitae est. Mauris
																		placerat eleifend leo.</p>
																	<ul>
																		<li>Lorem ipsum dolor sit amet, consectetuer</li>
																		<li>Aliquam tincidunt mauris eu risus</li>
																		<li>Vestibulum auctor dapibus neque</li>
																		<li>Morbi in sem quis dui placerat ornare</li>
																		<li>Donec eu libero sit amet quam egestas semper
																		</li>
																	</ul>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="tab-pane" id="tab_c">
													<div class="uni-our-service-2-content-default">
														<div class="row">
															<div class="col-md-5">
																<div class="item-img">
																	<img src="images/services/img2.jpg" alt=""
																		class="img-responsive">
																</div>
															</div>
															<div class="col-md-7">
																<div class="item-caption">
																	<div class="item-caption-title">
																		<h3>General health check</h3>
																		<div class="uni-line"></div>
																	</div>
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget,
																		tempor sit amet, ante. Donec eu libero sit amet quam
																		egestas semper. Aenean ultricies mi vitae est. Mauris
																		placerat eleifend leo.</p>
																	<ul>
																		<li>Lorem ipsum dolor sit amet, consectetuer</li>
																		<li>Aliquam tincidunt mauris eu risus</li>
																		<li>Vestibulum auctor dapibus neque</li>
																		<li>Morbi in sem quis dui placerat ornare</li>
																		<li>Donec eu libero sit amet quam egestas semper
																		</li>
																	</ul>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="tab-pane" id="tab_d">
													<div class="uni-our-service-2-content-default">
														<div class="row">
															<div class="col-md-5">
																<div class="item-img">
																	<img src="images/services/img3.jpg" alt=""
																		class="img-responsive">
																</div>
															</div>
															<div class="col-md-7">
																<div class="item-caption">
																	<div class="item-caption-title">
																		<h3>Diagnosis & treatment cancer</h3>
																		<div class="uni-line"></div>
																	</div>
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget,
																		tempor sit amet, ante. Donec eu libero sit amet quam
																		egestas semper. Aenean ultricies mi vitae est. Mauris
																		placerat eleifend leo.</p>
																	<ul>
																		<li>Lorem ipsum dolor sit amet, consectetuer</li>
																		<li>Aliquam tincidunt mauris eu risus</li>
																		<li>Vestibulum auctor dapibus neque</li>
																		<li>Morbi in sem quis dui placerat ornare</li>
																		<li>Donec eu libero sit amet quam egestas semper
																		</li>
																	</ul>
																</div>
															</div>
														</div>
													</div>
												</div>
												<div class="tab-pane" id="tab_e">
													<div class="uni-our-service-2-content-default">
														<div class="row">
															<div class="col-md-5">
																<div class="item-img">
																	<img src="images/services/img3.jpg" alt=""
																		class="img-responsive">
																</div>
															</div>
															<div class="col-md-7">
																<div class="item-caption">
																	<div class="item-caption-title">
																		<h3>Treatment of dermatitis</h3>
																		<div class="uni-line"></div>
																	</div>
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget,
																		tempor sit amet, ante. Donec eu libero sit amet quam
																		egestas semper. Aenean ultricies mi vitae est. Mauris
																		placerat eleifend leo.</p>
																	<ul>
																		<li>Lorem ipsum dolor sit amet, consectetuer</li>
																		<li>Aliquam tincidunt mauris eu risus</li>
																		<li>Vestibulum auctor dapibus neque</li>
																		<li>Morbi in sem quis dui placerat ornare</li>
																		<li>Donec eu libero sit amet quam egestas semper
																		</li>
																	</ul>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<!--DEPARTMENT, TESTIMONIAL, OPNING HOURES-->
						<div class="uni-services-de-test-hours">
							<div class="container">
								<div class="row">
									<!--DEPARTMENTS-->
									<div class="col-md-4">
										<div class="uni-services-department">
											<div class="uni-services-title">
												<h3>Departments</h3>
												<div class="uni-line"></div>
											</div>
											<div class="uni-services-department-content">
												<div class="accordion-default">
													<div class="accordion-icons-img">
														<div class="accordion">
															<div class="accordion-item">
																<div class="accordion-toggle active">
																	<div class="accordion-icosn">
																		<img src="images/icons_box/icon_1/icon-5.png" alt="">
																	</div>
																	<h4>cardiology</h4>
																</div>
																<div class="accordion-content" style="display: block">
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget.
																	</p>
																</div>
															</div>
															<div class="accordion-item">
																<div class="accordion-toggle">
																	<div class="accordion-icosn">
																		<img src="images/icons_box/icon_1/icon-4.png" alt="">
																	</div>
																	<h4>Neurology</h4>
																</div>
																<div class="accordion-content">
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget.
																	</p>
																</div>
															</div>
															<div class="accordion-item">
																<div class="accordion-toggle">
																	<div class="accordion-icosn">
																		<img src="images/icons_box/icon_1/icon-3.png" alt="">
																	</div>
																	<h4>Orthopedics</h4>
																</div>
																<div class="accordion-content">
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget.
																	</p>
																</div>
															</div>
															<div class="accordion-item">
																<div class="accordion-toggle">
																	<div class="accordion-icosn">
																		<img src="images/icons_box/icon_1/icon-2.png" alt="">
																	</div>
																	<h4>cancer department</h4>
																</div>
																<div class="accordion-content">
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget.
																	</p>
																</div>
															</div>
															<div class="accordion-item">
																<div class="accordion-toggle">
																	<div class="accordion-icosn">
																		<img src="images/icons_box/icon_1/icon-1.png" alt="">
																	</div>
																	<h4>Ophthalmology</h4>
																</div>
																<div class="accordion-content">
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget.
																	</p>
																</div>
															</div>
															<div class="accordion-item">
																<div class="accordion-toggle">
																	<div class="accordion-icosn">
																		<img src="images/icons_box/icon_1/icon.png" alt="">
																	</div>
																	<h4>Respiratory</h4>
																</div>
																<div class="accordion-content">
																	<p>Pellentesque habitant morbi tristique senectus
																		et netus et malesuada fames ac turpis egestas.
																		Vestibulum tortor quam, feugiat vitae, ultricies eget.
																	</p>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>

									<!--TESTIMONIALS-->
									<div class="col-md-4">
										<div class="uni-services-testimonials">
											<div class="uni-services-title">
												<h3>testimonials</h3>
												<div class="uni-line"></div>
											</div>
											<div class="uni-services-testimonials-content">
												<div class="uni-owl-one-item owl-carousel owl-theme">
													<div class="item">
														<div class="uni-shortcode-testimonials-default">
															<div class="item-info">
																<div class="row">
																	<div class="col-md-3">
																		<div class="item-info-img">
																			<img src="images/testimonial/img.png" alt=""
																				class="img-responsive">
																		</div>
																	</div>
																	<div class="col-md-9">
																		<div class="item-info-title">
																			<h4>amanda smith</h4>
																			<p class="testimonial_subtitle">myopia patients</p>
																		</div>
																		<div class="uni-divider"></div>
																	</div>
																</div>
															</div>
															<div class="item-caption">
																<p>Pellentesque habitant morbi tristique senectus et
																	netus et malesuada fames ac turpis egestas. Vestibulum
																	tortor quam, feugiat vitae, ultricies eget.</p>
															</div>
														</div>

														<div class="uni-shortcode-testimonials-default">
															<div class="item-info">
																<div class="row">
																	<div class="col-md-3">
																		<div class="item-info-img">
																			<img src="images/testimonial/img1.png" alt=""
																				class="img-responsive">
																		</div>
																	</div>
																	<div class="col-md-9">
																		<div class="item-info-title">
																			<h4>amanda smith</h4>
																			<p class="testimonial_subtitle">myopia patients</p>
																		</div>
																		<div class="uni-divider"></div>
																	</div>
																</div>
															</div>
															<div class="item-caption">
																<p>Pellentesque habitant morbi tristique senectus et
																	netus et malesuada fames ac turpis egestas. Vestibulum
																	tortor quam, feugiat vitae, ultricies eget.</p>
															</div>
														</div>

													</div>
													<div class="item">
														<div class="uni-shortcode-testimonials-default">
															<div class="item-info">
																<div class="row">
																	<div class="col-md-3">
																		<div class="item-info-img">
																			<img src="images/testimonial/img.png" alt=""
																				class="img-responsive">
																		</div>
																	</div>
																	<div class="col-md-9">
																		<div class="item-info-title">
																			<h4>amanda smith</h4>
																			<p class="testimonial_subtitle">myopia patients</p>
																		</div>
																		<div class="uni-divider"></div>
																	</div>
																</div>
															</div>
															<div class="item-caption">
																<p>Pellentesque habitant morbi tristique senectus et
																	netus et malesuada fames ac turpis egestas. Vestibulum
																	tortor quam, feugiat vitae, ultricies eget.</p>
															</div>
														</div>

														<div class="uni-shortcode-testimonials-default">
															<div class="item-info">
																<div class="row">
																	<div class="col-md-3">
																		<div class="item-info-img">
																			<img src="images/testimonial/img1.png" alt=""
																				class="img-responsive">
																		</div>
																	</div>
																	<div class="col-md-9">
																		<div class="item-info-title">
																			<h4>amanda smith</h4>
																			<p class="testimonial_subtitle">myopia patients</p>
																		</div>
																		<div class="uni-divider"></div>
																	</div>
																</div>
															</div>
															<div class="item-caption">
																<p>Pellentesque habitant morbi tristique senectus et
																	netus et malesuada fames ac turpis egestas. Vestibulum
																	tortor quam, feugiat vitae, ultricies eget.</p>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>

									<!--OPENING HOURS-->
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
												<a href="#" class="book-appointment">Book appointments</a>
											</div>
										</div>
									</div>
								</div>
							</div>
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

<!-- 03_01_services.html  [XR&CO'2014], Tue, 22 Oct 2019 11:55:26 GMT -->
</html>