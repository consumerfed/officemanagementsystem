<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title> Kozhikode Region </title>
      <link href="CSS/default.css" rel="stylesheet" type="text/css" />

  <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
  <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.10.1.min.js"></script>
  <script type="text/javascript" src="JS/googlemap.js"></script>
	<script>


function initialize() {
  var mapOptions = {
    zoom: 10,
    center: new google.maps.LatLng(11.319154,75.918564)
  }
  var map = new google.maps.Map(document.getElementById('map-canvas'),
                                mapOptions);

  setMarkers(map, beaches);
}
var infowindow = new google.maps.InfoWindow({
    maxWidth: 160
  });
// get javascript object here pass it to beach

//var beaches = getMarkerValues();

var beaches = [
  ['Regional Office', 11.253069,75.78281,4],
  ['TSM EastHill', 11.291158,75.774415,5],
  ['TSM Nadakkave', 11.273474,75.774783,3],
  ['TSM Paroppady', 11.294241,75.815177,2],
  ['TSM Kunnamangelam ', 11.305014,75.876385,1],
  ['LTS koodarnji ', 11.33333,76.1000,6],
  ['LTS kodenchery ', 11.4719,75.9690,7],
  ['LTS koodathai ', 11.39965,75.95466999,8],
  ['LTS panamaram', 11.7406,76.0758,9],
  ['LTS karassery', 11.314546,75.9989547,10],
  ['LTS koduvally', 11.3594,75.9111,11],
  ['LTS Manassery', 11.321213,75.967771,12],
  ['TSM Vatakara', 11.5672,75.6006,13],
  ['TSM Balussery', 11.4500,75.8300,14],
  ['TSM Feroke', 11.1833,75.8500,15],
  ['TSM Kadiyangade', 11.609356,75.76098760,16],
  ['TSM Kalpetta', 11.6226,76.0813,17],
  ['TSM Koyilandi', 11.4300,75.7000,18],
  ['TSM Mananthavady', 11.8000,76.0000,19],
  ['TSM Meenangady', 11.659552,76.1725774,20],
  ['TSM Nadapuram', 11.7000,75.6667,21],
  ['TSM Perambra', 11.5759,75.7339,22],
  ['TSM Thamarassery', 11.4139,75.9228,23],
  ['TSM Kakkatil', 11.679870,75.699884,24],
  ['TSM Panimukku', 11.551268,75.742342,25],
  ['MTS kulangara', 11.276544,76.014335,26],
  ['LTS Cheruvadi', 11.267088,75.988076,27],
  ['LTS KPK', 11.246806,75.775227,28],
  ['LTS Valaad', 11.794543,75.905984,29],
  ['TSM Grocery', 11.253165,75.782526,30],
  ['TSM Giftland', 11.253165,75.782526,31],
  ['TSM Cosmetics', 11.253165,75.782526,32],
  ['Gdw Grocery', 11.250476,75.778754,33],
  ['Gdw Cosmetics', 11.297953,75.790604,34],
  ['Gdw Vadakara', 11.605209,75.592482,35],
  ['Gdw Nanminda', 11.422080,75.834117,36],
  ['Gdw Kalpetta', 11.615664,76.093712,37]
];


function setMarkers(map, locations) {
  var markers = new Array();
  var marker;
  //alert(locations.length);
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
             infowindow.setContent(locations[i][0]);
              marker.setAnimation(google.maps.Animation.BOUNCE);
              infowindow.open(map, marker);
            }
          })(marker, i));
  }
}

google.maps.event.addDomListener(window, 'load', initialize);

    </script>
  </head>
  <body>
    <div id="map-canvas"></div>
  </body>
</html>

