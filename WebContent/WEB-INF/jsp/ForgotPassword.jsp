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
		<div class="col s1 m3 l3">
		</div>
		<div class="col s12 m6 l6">
			<div class="col s12 m12 l12 z-depth-3" style="margin-right: 20px;margin-top: 100px">
				<form class="col s12 m12 l12">
					<div class="row">
						<div class="input-field col s12">
				          <i class="medium material-icons prefix">perm_identity</i>
				          <input id="f_username" name="username" type="text" class="validate" placeholder="Username" onblur="checkUserName(this.value)">				         
				        </div>
					</div>
					<div id="f_forgotPasswordOption" class="row" style="display:none">
						<div class="input-field col s12">				          
				          	<p>
                     			<input id="f_forgotPassRecoverType_1" type="radio" name="forgotPassRecoverType" value="quactionType">
                     			<label for="f_forgotPassRecoverType_1">My Security Questions</label>
                 			</p>	
				          	<p>
                     			<input id="f_forgotPassRecoverType_2" type="radio" name="forgotPassRecoverType" value="requsetByAdminType">
                     			<label for="f_forgotPassRecoverType_2">Request By Administrator</label>
                 			</p>			         
				        </div>
					</div>
					<div id="f_quactionTypeSection" class="row" style="display:none">

					</div>
					<div id="f_requsetByAdminTypeSection" class="row" style="display:none">
						<div class="input-field col s12">
				          	<i class="medium material-icons prefix">perm_identity</i>
				          	<input id="f_mobileNo" name="mobileNo" type="text" class="validate" placeholder="Mobile Phone Number">				         
				        </div>
					</div>
					<div class="row">
						<div class="col s12 m5 l5">
							<button type="button" class="btn waves-effect waves-teal green accent-4">Reset</button>							
						</div>
						<div class="col s12 m2 l2"><br></div>
						<div class="col s12 m5 l5">
							<button type="button" onclick="location.href='welcome'" class="btn waves-effect waves-teal green accent-4">Back</button>							
						</div>
					</div>
				</form>       
			</div>
		</div>
		<div class="col s1 m3 l3">
		</div>
	</div>
	
		<script type="text/javascript" src="resources/js/config/jquery-2.1.1.min.js"></script>           
      	<script type="text/javascript" src="resources/js/config/materialize.min.js"></script>
      	<script type="text/javascript" src="resources/js/ForgotPassword.js"></script>
	</body>
</html>