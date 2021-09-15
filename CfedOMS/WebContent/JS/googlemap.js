$(document).ready(function(){
			//sendData();
   });


function getMarkerValues(){
	
	var triveniDetails = [
	              ['Regional Office', 11.253069,75.78281,4],
	              ['TSM EastHill', 11.291158,75.774415,5],
	               ['TSM Nadakkave', 11.273474,75.774783,3],
	               ['TSM Paroppady', 11.294241,75.815177,2],
	               ['TSM Kunnamangelam ', 11.305014,75.876385,1]
	               ['LTS koodarnji ', 11.33333,76.1000,6]
	              ['LTS kodenchery ', 11.4719,75.9690,7]
	             ];
	
	triveniDetails.push(['Test', 11.300241,75.835177,2]);
	return triveniDetails;
	
}

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
	var unit = new Object();  // title, content, lat ,long
	var mge = 'testing';
    //alert(mge);
    $.ajax({
        type: "POST",
        url: "UnitServlet",
        data: { message : mge  }
      }).done(function( msg ) {
        //alert( "Data Saved: " + msg );
        
      });
    return mge;
}

