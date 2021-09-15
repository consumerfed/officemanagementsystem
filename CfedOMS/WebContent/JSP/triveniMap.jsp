<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>kozhikode Region</title>
      <link href="CSS/trivenimap.css" rel="stylesheet" type="text/css" />

  <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.10.1.min.js"></script>
  <script type="text/javascript" src="JS/units.js"></script>
  
	<script>

	var directionsDisplay;
	var directionsService = new google.maps.DirectionsService();
	var map;
	function initialize() {
  			var mapOptions = {
    		zoom: 11,
    		center: new google.maps.LatLng(11.319154,75.918564)
  	}
  			
  	map = new google.maps.Map(document.getElementById('map-canvas'),
                                mapOptions);

  	setMarkers(map, beaches);
	}
	
	var infowindow = new google.maps.InfoWindow({
    maxWidth: 160
  });
	
	// function calcRoute()
	
// get javascript object here pass it to beach
//var triveniUnits = getUnits();
	//alert(' triveniunits '+triveniUnits.length);
	
	var beaches = testing();
	
	/*
var beaches = [
  ['Regional Office', 11.253069,75.78281,'IMAGES/RegionalOffice.png',4],
  ['TSM EastHill', 11.291158,75.774415,'IMAGES/Tkoduvaly.png',5],
  ['TSM Nadakkave', 11.273474,75.774783,'IMAGES/Tkoodaranji.png',3],
  ['TSM Paroppady', 11.294241,75.815177,'IMAGES/TNadapuram.png',2],
  ['TSM Kunnamangelam ', 11.305014,75.876385,'IMAGES/TKunnamangelam.png',1]
];
*/
function setMarkers(map, locations) {
  var markers = new Array();
  var marker;
  for (var i = 0; i < locations.length; i++) {
    var beach = locations[i];
    var myLatLng = new google.maps.LatLng(beach[1], beach[2]);
        marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
		title: beach[0],
        //zIndex: beach[3]
    });
        markers.push(marker);
        
		google.maps.event.addListener(marker, 'click', (function(marker, i) {
            return function() {
            	//var infoWinwhtml = '<div id="infowindow" style="width:320px; height:200px;" ><H4>'+locations[i][0]+'</H4></br><p><img src="'+locations[i][3]+'" alt="Triveni Image"></p></div>';
             //infowindow.setContent(locations[i][0]);
             var infoWinwhtml = '<div id="infowindow"><H4>'+locations[i][0]+'</H4></div>';
             infowindow.setContent(infoWinwhtml);
             var infoHtml = '<div  class="triveniInfo"><H4>'+locations[i][0]+'</H4></br><img src="'+locations[i][3]+'" alt="'+locations[i][0]+' image "><br><p> Distance : 200km <br> Ph : 0496 2524461 <br>Incharge Name : Name <br> Avg Sale per day : 50k <br>Is viable : Yes <br> Sq feet : 35sqfeet <br>Rent : nill <br>Agreement date : 01-01-2011 <br> 2013-14 sale :500k <br> 2014-15 sale :1000k <br> Inaugrated on 01-01-2014 </p></div>';
             marker.setAnimation(null);
              marker.setAnimation(google.maps.Animation.BOUNCE);
              //marker.shadow(shadow);
              infowindow.open(map, marker);
              var sidediv = document.getElementById('content-window');
              sidediv.innerHTML = infoHtml;
            }
          })(marker, i));
  }
}

google.maps.event.addDomListener(window, 'load', initialize);

    </script>
    
  </head>
  <body>
  	<div id="headerId" class="header">
		<div id="logo" class="logos"><img src="IMAGES/cfedLogo.jpg" alt="cfed Logo"></div>
		<h1> Consumerfed Kozhikode Region </h1>
		<div id="menuTabsId" class="menuTabs"><a href="index.jsp"> home </a><a href="trivenimap.html"> view map	</a> <a href="trivenimap.html"> ${unit.unitName}</a></div>
		
	</div>
  		<div id="panel">
  			<b>Select: </b>
   			 <select id="end" onchange="calcRoute();">
      			<option value="chicago, il">T kunnamangelam</option>
      			<option value="st louis, mo">T Nadapuram</option>
      			<option value="joplin, mo">T Paroppady</option>
      			<option value="oklahoma city, ok">T Easthill</option>
      			<option value="amarillo, tx">T Nadakkavu</option>
      			<option value="amarillo, tx">T Feroke</option>
			</select>
  		</div>
  		
    	<div id="map-canvas" style="width:80%; height:80%; float:left"></div>
    	<div id="content-window" style="width:20%; height:80%; float:left"></div>
   

  <div id="footerId" class="footer">
http://javabelazy.blogspot.in/</div>

  </body>
</html>