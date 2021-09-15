<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
        <title>Branch Details</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" href="../CSS/branchForm.css"/>
        <link href="CSS/jquery-ui.css" rel="stylesheet">
        <script type="text/javascript" src="JS/jquery.ui.datepicker.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?callback=initMap" async defer></script>
        <link href="CSS/style.css" rel="stylesheet">
        
  <script>
  	$(function() {
    	$( "#datepicker" ).datepicker();
  	});
  </script>

    </head>
    <body>    
        <form action="" class="register">
        <!-- 
            <h1>Branch Registration</h1>
            <fieldset class="row1">
                <legend>Account Details
                </legend>
                <p>
                    <label>Category
                    </label>
                    <input type="text"/>
                    <label>Firm Code
                    </label>
                    <input type="text"/>
                </p>
                <p>
                    <label>Name
                    </label>
                    <input type="text"/>
                    <label>Constituency
                    </label>
                    <input type="text"/>
                    <label class="obinfo">* mandatory fields
                    </label>
                </p>
            </fieldset>
             -->
            <fieldset class="row2">
            	
                <legend>Branch Details
                </legend>
                
                <p>
                    <label>Name
                    </label>
                    <input type="text"/>
                </p>
                
                <p>
                    <label>Firm Code
                    </label>
                    <input type="text"/>
                </p>
                
                <p>
                    <label>Category
                    </label>
                    <input type="text"/>
                </p>
              
               
                <p>
                    <label>Constituency
                    </label>
                    <input type="text"/>
                  
                </p>
                
                <p>
                    <label>Address *
                    </label>
                    <input type="text" class="long"/>
                </p>
                <p>
                    <label>Location *
                    </label>
                    <input type="text" id="pac-Input" placeholder ="Enter your location"  />
                </p>

                <p>
                    <label>City *
                    </label>
                    <input type="text" class="long" id="cityTxt"/>
                </p>
                <!--  
                <p>
                    <label>Country *
                    </label>
                    <select>
                        <option>
                        </option>
                        <option value="1">United States
                        </option>
                    </select>
                </p>
                -->
                <p>
                    <label>Inauguration Date *
                    </label>
                    <input type="text" maxlength="10" id="datepicker"/>
                </p>
                 <p>
                    <label>Lat *
                    </label>
                    <input type="text" maxlength="2" id="latBox" />
                    </p>
                    <p>
                    <label>Lon *
                    </label>
                    <input type="text" maxlength="2" id="lngBox" />
                </p>
                
                <p>
                    <label class="optional">Website
                    </label>
                    <input class="long" type="text" value="http://"/>

                </p>
            </fieldset>
            <fieldset class="row3">
                <legend>Branch Location
                </legend>
                <!-- 
                <p>
                    <label>Gender *</label>
                    <input type="radio" value="radio"/>
                    <label class="gender">Male</label>
                    <input type="radio" value="radio"/>
                    <label class="gender">Female</label>
                </p>
                
                -->
                  <!-- 
                <p>
                    <label>Inaugration date
                    </label>
                    <select class="date">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                    </select>
                    <select>
                        <option value="1">January
                        </option>
                        <option value="2">February
                        </option>
                        <option value="3">March
                        </option>
                        <option value="4">April
                        </option>
                        <option value="5">May
                        </option>
                        <option value="6">June
                        </option>
                        <option value="7">July
                        </option>
                        <option value="8">August
                        </option>
                        <option value="9">September
                        </option>
                        <option value="10">October
                        </option>
                        <option value="11">November
                        </option>
                        <option value="12">December
                        </option>
                    </select>
                    
                    <input class="year" type="text" size="4" maxlength="4"/>e.g 1976
                </p>
                
              
                <p>
                    <label>Nationality *
                    </label>
                    <select>
                        <option value="0">
                        </option>
                        <option value="1">United States
                        </option>
                    </select>
                </p>
                  
                <p>
                    <label>Children *
                    </label>
                    <input type="checkbox" value="" />
                </p>
                
                <img src="../IMAGES/googleMap.jpg" style="width:398px;height:209px;">
                -->
                <div id="map"></div>
   					 <script>
      					function initMap() {
        					var mapDiv = document.getElementById('map');
        					
       						var map = new google.maps.Map(mapDiv, {
          								center: {lat: 11.253069, lng: 75.78281},
          								zoom: 12
        								});
       						
       						var marker = new google.maps.Marker({
       									position: {lat: 11.253069, lng: 75.78281},
       									map: map,
       									title: 'Triveni location',
       									draggable: true
       					  				});
       						
       						var locationInput = document.getElementById('pac-Input');
       						
       						google.maps.event.addListener(marker, 'dragend', function (event) {
       							document.getElementById("latBox").value = this.getPosition().lat();
       							document.getElementById("lngBox").value = this.getPosition().lng();
       							//document.getElementById("cityTxt").value = locationInput;
       							});
       						
       						var autocomplete = new google.maps.places.Autocomplete(locationInput);
       						autocomplete.bindTo('bounds', map);
       						
       						var infowindow = new google.maps.InfoWindow();
       						
       					  	autocomplete.addListener('place_changed', function() {
       					  		alert(" autocomplete add listener ");
       					  	
       					    infowindow.close();
       					    //marker.setVisible(false);
       					    var place = autocomplete.getPlace();
       					    if (!place.geometry) {
       					      window.alert("Autocomplete's returned place contains no geometry");
       					      return;
       					    }
       					    
       					 var address = '';
        				    if (place.address_components) {
        				      address = [
        				        (place.address_components[0] && place.address_components[0].short_name || ''),
        				        (place.address_components[1] && place.address_components[1].short_name || ''),
        				        (place.address_components[2] && place.address_components[2].short_name || '')
        				      ].join(' ');
        				    }

        				    infowindow.setContent('<div><strong>' + place.name + '</strong><br>' + address);
        				    infowindow.open(map, marker);
       					    
       					 });
       						
       					
       				  //});
       						/*
       						var input = document.getElementById('pacInput');
       					  	var searchBox = new google.maps.places.SearchBox(input);
       					  	map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);
       					  	
       					  	searchBox.addListener('places_changed', function() {
       					    	var places = searchBox.getPlaces();

       					    		if (places.length == 0) {
       					      		return;
       					    }
       					 	*/
       						
     					}
    				</script>
    				
                <!--  
                <div class="infobox"><h4>Helpful Information</h4>
                    <p>Here comes some explaining text, sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                </div>
                -->
            </fieldset>
            <fieldset class="row4">
                <legend> blah blah blah...
                </legend>
                <p class="agreement">
                    <input type="checkbox" value=""/>
                    <label>*  Is the <a href="#">unit currently working</a></label>
                </p>
                <!--  
                <p class="agreement">
                    <input type="checkbox" value=""/>
                    <label>I want to receive personalized offers by your site</label>
                </p>
                <p class="agreement">
                    <input type="checkbox" value=""/>
                    <label>Allow partners to send me personalized offers and related services</label>
                </p>
                -->
            </fieldset>
            <div><button class="button">Register &raquo;</button></div>
        </form>
    </body>
</html>





