<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Leaf</title>
		<link href="resources/css/icon.css" rel="stylesheet">     
		<link rel="stylesheet" href="resources/css/materialize.min.css">
		<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	</head>
	<body>	
	<nav>
		<div class="nav-wrapper green accent-4">
			<a href="#" class="brand-logo">Logo</a>    
		</div>
	</nav>
	<div class="row">
		<div class="col s12 m8 l8">
			<div>
				<img style="margin: 20px;height: auto;width: aoto" src="resources/image/leafLogo.png">
			</div>
		</div>
		<div class="col s12 m4 l4">
			<div class="col s12 m12 l12 z-depth-3" style="margin-right: 20px;margin-top: 100px">
				<form class="col s12 m12 l12">
					<div class="row">
						<div class="input-field col s12">
				          <i class="medium material-icons prefix">perm_identity</i>
				          <input id="f_username" name="username" type="text" class="validate" placeholder="Username">				         
				        </div>
					</div>
					<div class="row">
						<div class="input-field col s12">
				          <i class="medium material-icons prefix">lock_outline</i>
				          <input id="f_password" name="password" type="password" class="validate" placeholder="Password">				         
				        </div>
					</div>
					<div class="row">
						<div class="input-field col s12">				                        
							<p>
                     			<input id="f_rememberMe" type="checkbox" name="rememberMe" value="true">
                     			<label for="f_rememberMe">Remember Me</label>
                 			</p>				    
                      	</div>
					</div>
					<div class="row">
						<div class="col s12 m5 l5">
							<button class="btn waves-effect waves-teal green accent-4">Login</button>							
						</div>
						<div class="col s12 m2 l2"><br></div>
						<div class="col s12 m5 l5">
							<button type="button" onclick="location.href='forgotPassword'" class="btn waves-effect waves-teal green accent-4">Forgot Password</button>							
						</div>
					</div>
				</form>       
			</div>
		</div>
	</div>
	
		<script type="text/javascript" src="resources/js/config/jquery-2.1.1.min.js"></script>           
      	<script src="resources/js/config/materialize.min.js"></script>
	</body>
</html>