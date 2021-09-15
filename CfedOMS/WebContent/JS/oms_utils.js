

function showEmailPopup(){
	var senderEmail = prompt("Enter your email id : ");
	alert(senderEmail);
	
	  $.ajax({
	        type: "GET",
	        url: "registration.html",
	        data: { emailId : senderEmail}
	      }).done(function( msg ) {
	        alert( "Data Saved: " + msg );
	      });
}