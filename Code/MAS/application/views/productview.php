<html>
<head>

<!--<link rel="stylesheet" type="text/css" href="http://localhost/ci/assets/css/bootstrap.min.css">-->
<!--<?php  echo link_tag('http://localhost/MAS/assets/css/bootstrap.min.css');?>-->

<!-- Basic Page Needs
    ================================================== -->
    <meta charset="utf-8">
    <!--[if IE]><meta http-equiv="x-ua-compatible" content="IE=9" /><![endif]-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ethanol Portfolio Template - Index Default</title>
    <meta name="description" content="Ethanol is an Agency and Personal Portfolio Template built with bootstrap 3.3.2. This is created for a cause to support my uncle's campaign. Go and Donate at - https://life.indiegogo.com/fundraisers/medical-support-for-a-filipino-overseas-worker--3/x/10058181">
    <meta name="keywords" content="portfolio, agency, bootstrap theme, mobile responsive, template, personal">
    <meta name="author" content="ThemeForces.Com">
    
    <!-- Favicons
    ================================================== -->
    <link rel="shortcut icon" href="http://localhost/MAS/assets/img/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="http://localhost/MAS/assets/img/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="http://localhost/MAS/assets/img/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="http://localhost/MAS/assets/img/apple-touch-icon-114x114.png">

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="http://localhost/MAS/assets/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="http://localhost/MAS/assets/fonts/font-awesome/css/font-awesome.css">

    <!-- Nivo Lightbox
    ================================================== -->
    <link rel="stylesheet" href="http://localhost/MAS/assets/css/nivo-lightbox.css" >
    <link rel="stylesheet" href="http://localhost/MAS/assets/css/nivo_lightbox_themes/default/default.css">

    <!-- Slider
    ================================================== -->
    <link href="http://localhost/MAS/assets/css/owl.carousel.css" rel="stylesheet" media="screen">
    <link href="http://localhost/MAS/assets/css/owl.theme.css" rel="stylesheet" media="screen">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css"  href="http://localhost/MAS/assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="http://localhost/MAS/assets/css/responsive.css">

    
    <script type="text/javascript" src="http://localhost/MAS/assets/js/modernizr.custom.js"></script> 
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


 </head>
 <body>
  <!-- Main Navigation 
    ================================================== -->
    <nav id="tf-menu" class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#"><img src="http://localhost/MAS/assets/img/logo.png" alt="..."></a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav navbar-right">
                <li><a href="#tf-home" class="scroll">Home</a></li>
                <li><a href="#tf-services" class="scroll">Services</a></li>
                <li><a href="#tf-about" class="scroll">About</a></li>
                <li><a href="#tf-works" class="scroll">Works</a></li>
                <li><a href="#tf-process" class="scroll">Process</a></li>
                <li><a href="#tf-pricing" class="scroll">Pricing</a></li>
                <li><a href="#tf-blog" class="scroll">Blog</a></li>
                <li><a href="#tf-contact" class="scroll">Contact</a></li>
              </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
 
 <!-- Home Section
    ================================================== -->
    <div id="tf-home">
        <div class="overlay"> <!-- Overlay Color -->
            <div class="container"> <!-- container -->
                <div class="content-heading text-center"> <!-- Input Your Home Content Here -->
                    <h1>Maharashtra Auto Service Center</h1>
                        <p class="lead">We create beautiful, innovative and  effective handcrafted brands & website.</p>
                    <a href="#tf-works" class="scroll goto-btn text-uppercase">View Our Works</a> <!-- Link to your portfolio section -->
                </div><!-- End Input Your Home Content Here -->
            </div> <!-- end container -->
        </div><!-- End Overlay Color -->
    </div>

 <div class="row text-center"> <!-- contact form outer row with centered text-->
    <h2>Product Details</h2>
      <div class="col-md-10 col-md-offset-1"> 
           <form method="post" id="contact-form" class="form" name="sentMessage" novalidate action="product/prodetail">
                      
             <!--Display Successful Message that you have successfully registered-->

             <?php if($this->session->flashdata('success')){?>
                   <h5 style="color:green"> <?php echo $this->session->flashdata('success');?> </h5>
             <?php
             }?>

               <div class="row">
                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                       
                        <select name="protypeId" autocomplete=off class="form-control" prompt="Select Product Type Id">
                              <option>Select Product Type Id</option>
                        </select>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                                <?php echo form_error('protypeId');?>
                          </div>
                       </div>
                   </div>
                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                       
                       <?php echo form_input(["autocomplete"=>"off","class"=>"form-control","placeholder"=>"Product Name *","name"=>"prodname" ,"required"]);?>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                               <?php echo form_error('prodname');?>
                          </div>
                       </div>
                   </div>
                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                          
                       <?php echo form_textarea(["autocomplete"=>"off","class"=>"form-control","placeholder"=>"Product Desciption *","name"=>"proddes" ,"rows"=>"7","required"]);?>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                               <?php echo form_error('proddes');?>
                          </div>
                       </div>
                   </div>
                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                         
                          <input type="text" autocomplete="off" class="form-control" placeholder="Purchase Date" name="purchdate" onfocus="(this.type='date')">
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                                  <?php echo form_error('purchdate');?>
                          </div>
                       </div>
                   </div>

                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                         
                          <?php echo form_input(["autocomplete"=>"off","class"=>"form-control","placeholder"=>"Product Purchase Rate *","name"=>"purchrate" ,"required"]);?>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                                 <?php echo form_error('purchrate');?>
                          </div>
                       </div>
                   </div>

                    <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                          <!--<input type="password" autocomplete="off" class="form-control" placeholder="Your confirm password *" name="confpassword" required >-->
                         <?php echo form_input(["autocomplete"=>"off","class"=>"form-control","placeholder"=>"Product Sale Rate *","name"=>"salerate" ,"required"]);?>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                                 <?php echo form_error('salerate');?>
                          </div>
                       </div>
                   </div>

                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                          <!--<input type="password" autocomplete="off" class="form-control" placeholder="Your confirm password *" name="confpassword" required >-->
                          <input type="text" autocomplete="off" class="form-control" placeholder="Manufacture Date" name="manufdate" onfocus="(this.type='date')">
                          <div class="col-md-12">
                                 <?php echo form_error('manufdate');?>
                          </div>
                       </div>
                   </div>

                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                          <!--<input type="password" autocomplete="off" class="form-control" placeholder="Your confirm password *" name="confpassword" required >-->
                          <input type="text" autocomplete="off" class="form-control" placeholder="Expiry Date" name="expdate" onfocus="(this.type='date')">
                          <div class="col-md-12">
                                 <?php echo form_error('expdate');?>
                          </div>
                       </div>
                   </div>

                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                          <!--<input type="password" autocomplete="off" class="form-control" placeholder="Your confirm password *" name="confpassword" required >-->
                         <?php echo form_input(["autocomplete"=>"off","class"=>"form-control","placeholder"=>"Product Manufacture Company *","name"=>"manufcomp" ,"required"]);?>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                                 <?php echo form_error('manufcomp');?>
                          </div>
                       </div>
                   </div>

                   <div class="col-md-6">
                       <div class="form-group"> <!-- Your name input -->
                          <!--<input type="password" autocomplete="off" class="form-control" placeholder="Your confirm password *" name="confpassword" required >-->
                         <?php echo form_input(["autocomplete"=>"off","class"=>"form-control","placeholder"=>"Product Warranty Period *","name"=>"warrperiod" ,"required"]);?>
                          <p class="help-block text-danger"></p>
                          <div class="col-md-12">
                                 <?php echo form_error('warrperiod');?>
                          </div>
                       </div>
                   </div>


                </div>

                          
                        <!--<button type="submit" name="submit" class="btn btn-primary tf-btn color">Submit</button>--> <!-- Send button -->
                        <?php echo form_submit(["name"=>"submit","value"=>"Submit","class"=>"btn btn-primary tf-btn color","onClick"=>"return validation();"]);?>
             </form>
       </div>
 </div>

  <div id="tf-footer">
        <div class="container"><!-- container -->
            <p class="pull-left">© 2015 ethanol. All rights reserved. Theme by Rudhi Sasmito.</p> <!-- copyright text here-->
            <ul class="list-inline social pull-right">
                <li><a href="#"><i class="fa fa-facebook"></i></a></li> <!-- Change # With your FB Link -->
                <li><a href="#"><i class="fa fa-twitter"></i></a></li> <!-- Change # With your Twitter Link -->
                <li><a href="#"><i class="fa fa-google-plus"></i></a></li> <!-- Change # With your Google Plus Link -->
                <li><a href="#"><i class="fa fa-dribbble"></i></a></li> <!-- Change # With your Dribbble Link -->
                <li><a href="#"><i class="fa fa-behance"></i></a></li> <!-- Change # With your Behance Link -->
                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> <!-- Change # With your LinkedIn Link -->
                <li><a href="#"><i class="fa fa-youtube"></i></a></li> <!-- Change # With your Youtube Link -->
                <li><a href="#"><i class="fa fa-pinterest"></i></a></li> <!-- Change # With your Pinterest Link -->
            </ul>
        </div><!-- end container -->
    </div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>-->
    <script type="text/javascript" src="http://localhost/MAS/assets/js/jquery.1.11.1.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script type="text/javascript" src="http://localhost/MAS/assets/js/bootstrap.js"></script>

    <script type="text/javascript" src="http://localhost/MAS/assets/js/owl.carousel.js"></script><!-- Owl Carousel Plugin -->

    <script type="text/javascript" src="http://localhost/MAS/assets/js/SmoothScroll.js"></script>

    <!-- Google Map -->
   <!-- <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyASm3CwaK9qtcZEWYa-iQwHaGi3gcosAJc&amp;sensor=false"></script>-->
   <!-- <script type="text/javascript" src="http://localhost/MAS/assets/js/map.js"></script>-->

    <!-- Parallax Effects -->
    <script type="text/javascript" src="http://localhost/MAS/assets/js/skrollr.js"></script>
    <script type="text/javascript" src="http://localhost/MAS/assets/js/imagesloaded.js"></script>

    <!-- Portfolio Filter -->
    <script type="text/javascript" src="http://localhost/MAS/assets/js/jquery.isotope.js"></script>

    <!-- LightBox Nivo -->
    <script type="text/javascript" src="http://localhost/MAS/assets/js/nivo-lightbox.min.js"></script>

    <!-- Contact page
    <script type="text/javascript" src="http://localhost/MAS/assets/js/jqBootstrapValidation.js"></script>
    <script type="text/javascript" src="http://localhost/MAS/assets/js/contact.js"></script>-->

    <!-- Javascripts
    ================================================== -->
    <script type="text/javascript" src="http://localhost/MAS/assets/js/main.js"></script>

 </body>
 </html>