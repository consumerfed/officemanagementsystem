<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
               "nijesh kumar",
               "vipin cp",
               "shimjith kumar",
               "bithesh s",
               "jerin",
               "asharaf",
               "manoj",
               "divya",
               "ranjith",
               "deepa",
               "nimisha",
          		"remya"	
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
<div class="oms-header">
	<ul>
		<li><a href="home.html"> Home </a></li>
		<li><a href="tasks.html"> tasks </a></li>
		<li><a href="unitMap.html"> maps</a></li>
		<li><a href="units.html"> unit </a></li>
		<li><a href="inbox.html"> inbox </a></li>
		<li><a href="issue.html"> complaint </a></li>
		<li><a href="contact.html"> contact us </a></li>
		<li><a href="logout.html"> Logout </a></li>
		<li><a href="tasks.html"> Welcomeadmin! </a></li>
	</ul>
</div>

<div id="compose">
	<h4>Compose</h4>
 		<div class="ui-widget">
      		<label for="automplete-3">To: </label>
         		<input id="automplete-3">
      	</div>
      <br><br><br><br>
      <br>
		<textarea rows="6" cols="20" placeholder="yourmessage"></textarea>
		<br>
		<input type="button" name="send" value="send">			

</div>

<div id="messageList">
<h4> My Messages</h4>

<div class="message">
<h4>Nijesh kumar <span> 10am </span> </h4>
<p> 
Says : I updated the file please check it.
</p>
</div>

<div class="message">
<h4>Shimjith kumar <span> 10:15am </span> </h4>
<p> 
Says : I updated the file please check it.
</p>
</div>
<div class="message">
<h4> Vipin c p <span> 11am </span> </h4>
<p> 
Says : I updated the file please check it.
</p>
</div>
<div class="message">
<h4>Deepak kumar <span> 12am </span> </h4>
<p> 
Says : I updated the file please check it.
</p>
</div>
<div class="message">
<h4>Ram kumar <span> 1:13pm </span> </h4>
<p> 
Says : I updated the file please check it.
</p>
</div>
<div class="message">
<h4>Devas kumar <span> 1:25pm </span> </h4>
<p> 
Says : I updated the file please check it.
</p>
</div>
<div class="message">
<h4>C R Das <span> 10am </span> </h4>
<p> 
Says : all task updated
</p>
</div>
</div>

<div id="conversationList">
<h4> conversations </h4>
<div class="conversation">
<h4>Nijesh kumar <span> 10am </span> </h4>
<p> 
yes
</p>
</div>
<div class="conversation">
<h4>Shimjith kumar <span> 10:15am </span> </h4>
<p> 
No
</p>
</div>
<div class="conversation">
<h4>Nijesh kumar <span> 10am </span> </h4>
<p> 
yes
</p>
</div>
<div class="conversation">
<h4>Shimjith kumar <span> 10:15am </span> </h4>
<p> 
No
</p>
</div>
<div class="conversation">
<h4>Nijesh kumar <span> 10am </span> </h4>
<p> 
hi
</p>
</div>
<div class="conversation">
<h4>Shimjith kumar <span> 10:15am </span> </h4>
<p> 
hi
</p>
</div>
<div class="conversation">
<h4>Nijesh kumar <span> 10am </span> </h4>
<p> 
hello
</p>
</div>
<div class="conversation">
<h4>Shimjith kumar <span> 10:15am </span> </h4>
<p> 
No !!
</p>
</div>
</div>

<div id="footer">
Regional Office I T Section
</div>


</body>
</html>