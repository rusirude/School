
$('#requsetByAdminTypeSection').hide();
$('#quactionTypeSection').hide();
$('input[name=forgotPassRecoverType]').change(function(){	
	selectPasswordResetOption();
});



function selectPasswordResetOption(){
	
	var username = $('input[name=username]').val();
	if(username == '' || username == null || typeof(username) == 'undefined'){
		$('#f_requsetByAdminTypeSection').hide('10000');
		$('#f_quactionTypeSection').hide('10000');
		alert("Error Massaage");
		return;
	}
	var forgotPassRecoverType = $('input[name=forgotPassRecoverType]:checked').val();	
	if(forgotPassRecoverType == 'quactionType'){
		getMySecurityQuactions();
		$('#f_requsetByAdminTypeSection').hide('10000');
		$('#f_quactionTypeSection').show('10000');
		
	}
	else if(forgotPassRecoverType == 'requsetByAdminType'){
		$('#f_quactionTypeSection').hide('10000');
		$('#f_requsetByAdminTypeSection').show('10000');
	}
	else{
		alert("Error Massaage");
		return;
	}
	
}


function checkUserName(username){
	if(username == '' || username == null || typeof(username) == 'undefined'){
		alert("Username can not be empty");
		$('#f_forgotPasswordOption,#f_requsetByAdminTypeSection,#f_quactionTypeSection').hide('10000');
		return;
	}
	$.ajax({
		url: '/School/forgotPassword/checkUser/'+username+'.json',
		type: 'GET',
		dataType: 'json',			
		success: function(data, textStatus, jqXHR) {
			var response =data.ajaxResponseDTO;
			if(response.valid == true){
				if(response.obj == 1){					
					$('#f_forgotPasswordOption').show('10000');
				}
				else if(response.obj > 1){
					$('#f_forgotPasswordOption,#f_requsetByAdminTypeSection,#f_quactionTypeSection').hide('10000');
					alert("Multipel User found. Please inform to admin");					
				}
				else{
					$('#f_forgotPasswordOption,#f_requsetByAdminTypeSection,#f_quactionTypeSection').hide('10000');
					alert("User not found");	
				}
			}
			else{
				$('#f_forgotPasswordOption,#f_requsetByAdminTypeSection,#f_quactionTypeSection').hide('10000');
				alert(response.errorMsg);
			}
					
		},
		error: function(jqXHR, textStatus, errorThrown) {
			}
	});
	
}

function getMySecurityQuactions(){
	var username = $('input[name=username]').val();
	if(username == '' || username == null || typeof(username) == 'undefined'){
		alert("Username can not be empty");
		$('#f_forgotPasswordOption,#f_requsetByAdminTypeSection,#f_quactionTypeSection').hide('10000');
		return;
	}
	$.ajax({
		url: '/School/forgotPassword/getSecurityQuactions/'+username+'.json',
		type: 'GET',
		dataType: 'json',			
		success: function(data, textStatus, jqXHR) {
			var response =data.ajaxResponseDTO;
			if(response.valid == true){				
				var quactions = "";
				for(var i=0;i < response.obj.length;i++){
					quactions += "<div class=\"input-field col s12\">"+
									 "<i class=\"medium material-icons prefix\">perm_identity</i>"+
									 "<input id=\"f_securityQuactions_"+(i+1)+"\" name=\"securityQuactions_"+(i+1)+"\" type=\"text\" class=\"validate\" placeholder=\""+response.obj[i].question+"\">"+				         
								 "</div>";
				}
				$("#f_quactionTypeSection").html(quactions);

				
			}
			else{
				alert(response.errorMsg);
			}
					
		},
		error: function(jqXHR, textStatus, errorThrown) {
			}
	});
	
}