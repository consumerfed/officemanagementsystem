$(document).ready(function(){
			//sendData();
   });

function sendData(){
	alert(' inside sendData ');
	var mge = 'getUnit';
    alert(mge);
    $.ajax({
        type: "POST",
        url: "UnitServlet",
        data: { message : mge  }
      }).done(function( msg ) {
        alert( "Data Saved: " + msg );
        
      });
}


function getUnits(){
	var units = new Array();
	var unit; // title, content, lat ,long
	var mge = 'testing';
    //alert(mge);
    $.ajax({
        type: "POST",
        url: "UnitServlet",
        data: { message : mge  }
      }).done(function( msg ) {
        //alert( "Data Saved: " + msg );
    	  unit.title = 'Regional Office';
    	  unit.lat = 11.253069;
    	  unit.lon = 75.78281;
    	  unit.content = '<div id="infowindow"> Regional office. </div>';
    	  units.push(unit);
        
      });
    return units;
}

function testing(){
	var triveniUnits = [
	               ['Regional Office', 11.253069,75.78281,'IMAGES/RegionalOffice.png',4],
	               ['TSM EastHill', 11.291158,75.774415,'IMAGES/Tkoduvaly.png',5],
	               ['TSM Nadakkave', 11.273474,75.774783,'IMAGES/Tkoodaranji.png',3],
	               ['TSM Paroppady', 11.294241,75.815177,'IMAGES/TNadapuram.png',2],
	               ['TSM Kunnamangelam ', 11.305014,75.876385,'IMAGES/TKunnamangelam.png',1]
	             ];
	return triveniUnits;
}

