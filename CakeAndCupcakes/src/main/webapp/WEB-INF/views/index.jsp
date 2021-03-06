<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blue Sea</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 <style>
 body {
position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	bottom: 0px;
	width: auto;
	height: auto;
	background-image:  url("resources/images/download.jpg");
	background-size: cover;
     
     
}
    /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
    
  .carousel-inner img {
      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none;
    }
  }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Corporate</a></li>
        <li><a href="#">Events</a></li>
        <li><a href="#">Delivery</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="signup"><span class="glyphicon glyphicon-sign-up"></span> Sign Up</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container">
<div class="row">
  <div class="col-sm-8">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
      </ol>

      <!-- Wrapper for slides -->
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img src="resources/images/71.jpg" alt="Image">
          <div class="carousel-caption">
            <h3 class="italic">CUPCAKES DELIVERED NEXT DAY</h3>
           
          </div>
        </div>

        <div class="item">
          <img src="resources/images/2.jpg" class="img-responsive" alt="Image">
          <div class="carousel-caption">
            <h3>TONS OF FLAVOUR </h3>
            
          </div>
        </div>
        
         <div class="item">
          <img src="resources/images/maxresdefault1.jpg" class="img-responsive" alt="Image">
          <div class="carousel-caption">
            <h3>TONS OF FLAVOUR </h3>
            
          </div>
        </div>
         
      </div>

      <!-- Left and right controls -->
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-"resources/images/6.jpg">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
  </div>
  <div class="col-sm-4">
    <div class="well">
      <p>Some text..</p>
    </div>
    <div class="well">
       <p>Upcoming Events..</p>
    </div>
    <div class="well">
       <p>Visit Our Blog</p>
    </div>
  </div>
</div>
<hr>
</div>


  
<div class="container text-center">
  <h3>Beautiful handmade cupcakes</h3><br>
  <div class="row">
    <div class="col-sm-4">
      <img src="resources/images/5.jpg" class="img-responsive" style="width:100%" alt="Image">
       <h2>Seasonal</h2>
      <p>Designed with flair and created with loving attention to details, our seasonal range for all those special times of year is not to be missed!</p>
    </div>
    <div class="col-sm-4">
      <img src="resources/images/6.jpg" class="img-responsive" style="width:100%" alt="Image">
      <p>Project 2</p>
    </div>
    <div class="col-sm-4">
      <div class="well">
      <p>Great celebrations this weekend... Have you ordered your cupcakes ? Every party should have some yummy cakes! .</p>
      </div>
      <div class="well">
       <p>It's that time of year again! Combine with some of our strawberry cupcakes for that lazy summer's day feeling... .</p>
      </div>
    </div>
  </div>
</div><br>

<footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>

</body>
</html>