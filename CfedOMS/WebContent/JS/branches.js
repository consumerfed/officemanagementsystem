/**
$(document).ready(function() {
 var branches = ["Regional Office", "tsm nadakkavu", "zonal office"];
                        $('#branchListDiv').html('<div class="branch"><table width="400" height="80"><tr><th>TRIVENI SUPER MARKET NADAPURAM</th></tr><tr><td>NEAR BUSSTAND</td><td>400sqft</td><td rowspan="3">img</td></tr><tr><td>NADAPURAM POST</td><td>3000rent</td></tr><tr><td>PH:2345698</td></tr></table></div>');
                });

**/

$(document).ready(function() {
	getBranchList();
	 var branches = ["Regional Office", "tsm nadakkavu", "zonal office"];
	 //var index;
	 //var val;
	 $('#branchListDiv').html('');
	 $.each(branches, function(index, val) {
		  $('#branchListDiv').append('<div class="branch"><table width="400" height="80"><tr><th>TRIVENI SUPER MARKET NADAPURAM</th></tr><tr><td>NEAR BUSSTAND</td><td>400sqft</td><td rowspan="3">img</td></tr><tr><td>NADAPURAM POST</td><td>3000rent</td></tr><tr><td>PH:2345698</td></tr></table></div>');
		  
		});
});

function getBranchList(){
    //var mge = $('#headText').val();
    var startNo = 1;
    var endNo = 10;
    $.ajax({
          type: "POST",
          url: "hello.html",
          data: { startLimit : startNo, endLimit : endNo},
          success : function(data){
              alert('success'+data);
          }
        });
    }