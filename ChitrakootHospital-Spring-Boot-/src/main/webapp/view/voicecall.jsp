<!DOCTYPE html>
<html lang="en">


<!-- voice-call23:29-->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">
    <title>chitrakoot Hospital</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    <!--[if lt IE 9]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
	<![endif]-->
</head>

<body>
    <div class="main-wrapper">
        <div class="header">
            <div class="header-left">
                <a href="index-2.html" class="logo">
                    <img src="images/logohospital.png" width="35" height="35" alt=""> <span>Chitrakoot Hospital</span>
                </a>
            </div>
            <a id="mobile_btn" class="mobile_btn float-left" href="#sidebar"><i class="fa fa-bars"></i></a>
            <ul class="nav user-menu float-right">
               
                
              
            </ul>
            
        </div>
        <div class="page-wrapper">
            <div class="chat-main-row">
                <div class="chat-main-wrapper">
                    <div class="col-lg-9 message-view chat-view">
                        <div class="chat-window">
                            <div class="fixed-header">
								<div class="navbar">
                                    <div class="user-details mr-auto">
                                        <div class="float-left user-img m-r-10">
                                            <a href="profile.html" title="Jennifer Robinson"><img src="images/logohospital.png" alt="" class="w-40 rounded-circle"><span class="status online"></span></a>
                                        </div>
                                        <div class="user-info float-left">
                                            <a href="profile.html" title="Jennifer Robinson"><span class="font-bold">Technical Team(Chitrakoot Hospital)</span></a>
                                            <span class="last-seen">Online</span>
                                        </div>
                                    </div>
                                    <ul class="nav float-right custom-menu">
                                        <li class="nav-item">
                                            <a class="task-chat profile-rightbar float-right" href="#chat_sidebar" id="task_chat"><i aria-hidden="true" class="fa fa-comments"></i></a>
                                        </li>
                                        <li class="nav-item dropdown dropdown-action">
                                            <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-cog"></i></a>
											
                                        </li>
                                    </ul>
								</div>
                            </div>
                            <div class="chat-contents">
                                <div class="chat-content-wrap">
                                    <div class="voice-call-avatar">
                                        <img src="images/logohospital.png" alt="" class="call-avatar">
                                        <span class="username">Ringing....</span>
                                        
                                         <%  %>
                                        <span class="call-timing-count"></span>
                                    </div>
                                    <div class="call-users">
                                        <ul>
                                            <li>
                                                <a href="#">
                                                    <img src="assets/img/user-04" class="img-fluid" alt="">
                                                    <span class="call-mute"><i class="fa fa-microphone-slash"></i></span>
                                                </a>
                                            </li>
                                            
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="chat-footer">
                                <div class="call-icons">
                                    <ul class="call-items">
                                        <li class="call-item">
                                            <a href="#" title="Enable Video" data-placement="top" data-toggle="tooltip">
                                                <i class="fa fa-video-camera camera"></i>
                                            </a>
                                        </li>
                                        <li class="call-item">
                                            <a href="#" title="Mute" data-placement="top" data-toggle="tooltip">
                                                <i class="fa fa-microphone microphone"></i>
                                            </a>
                                        </li>
                                       
                                            </a>
                                        </li>
                                    </ul>
                                    <div class="end-call">
                                        <a href="${pageContext.request.contextPath }/home">End Call</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 message-view chat-profile-view chat-sidebar" id="chat_sidebar">
                        <div class="chat-window video-window">
                            <div class="fixed-header">
                                <ul class="nav nav-tabs nav-tabs-bottom">
                                   
                                    <li class="nav-item"><a class="nav-link " href="#profile_tab" data-toggle="tab">Profile</a></li>
                                </ul>
                            </div>
                            <div class="tab-content chat-contents">
                                <div class="content-full tab-pane show " id="calls_tab">
                                    <div class="chat-wrap-inner">
                                        <div class="chat-box">
                                            <div class="chats">
                                                <div class="chat chat-left">
                                                    <div class="chat-avatar">
                                                        <a href="profile.html" class="avatar">
                                                            <img alt="John Doe" src="images/logohospital.png" class="img-fluid rounded-circle">
                                                        </a>
                                                    </div>
                                                    
                                                </div>
                                               
                                                
                                                
                                                
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="content-full tab-pane show active" id="profile_tab">
                                    <div class="display-table">
                                        <div class="table-row">
                                            <div class="table-body">
                                                <div class="table-content">
                                                    <div class="chat-profile-img">
                                                        <div class="edit-profile-img">
                                                            <img src="images/logohospital.png" alt="">
                                                            
                                                        </div>
                                                        <h3 class="user-name m-t-10 mb-0">Chitrakoot Hospital</h3>
                                                        <small class="text-muted">sitapur chitrakoot</small>
                                                         <small class="text-muted">chitrakoothospital108@gmail.com</small>
                                                        <a href="edit-profile.html" class="btn btn-primary edit-btn"><i class="fa fa-pencil"></i></a>
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
            
           
           
           
        </div>
    </div>
    <div class="sidebar-overlay" data-reff=""></div>
    <script src="assets/js/jquery-3.2.1.min.js"></script>
	<script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/app.js"></script>
</body>


<!-- voice-call23:30-->
</html>