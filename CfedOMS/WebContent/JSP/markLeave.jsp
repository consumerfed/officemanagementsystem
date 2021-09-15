<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="CSS/messages.css" rel="stylesheet">
<link href="CSS/design.css" rel="stylesheet">
<title> OMS work</title>

 <link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
      <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
      <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
      
        <!-- Javascript -->
      <script>
         $(function() {
            var availableTutorials = [
               "REGIONAL OFFICE KOZHIKODE",
               "TRIVENI SUPER MARKET NADAPURAM",
               "MINI TRIVENI KULANGARA",
               "LITTLE TRIVENI STORE PANAMARAM",
               "MOBILE TRIVENI ELATHOOR",

            ];
            $( "#automplete-3" ).autocomplete({
               minLength:1,   
               delay:100,   
               source: availableTutorials
            });
         });
      </script>
</head>
<body>

<div id="compose">
	<h4>Branch Name</h4>
 		<div class="ui-widget">
      		<label for="automplete-3"> Branch Name: </label>
         		<input id="automplete-3">
      	</div>
      <br><br><br><br>
      <br>
		<textarea rows="6" cols="20" placeholder="yourmessage"></textarea>
		<br>
		<input type="button" name="send" value="send">			

</div>

</body>
</html>