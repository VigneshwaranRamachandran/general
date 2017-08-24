var app = angular.module('mainApp', []);

app.controller('ticketController', function($scope) {
  $scope.something = function(form) {
	  
	 	  var vehicle=document.getElementById("vehicle").value;
	 	 var headcount=document.getElementById("headcount").value;
	  //alert(d2);
   //alert(d);
//	  var data = {};
//		data.v = vehicle;
//		data.h =headcount;
//		
//		$.ajax({
//			type: 'GET',
//			data: JSON.stringify(data),
//	        contentType: 'application/json',
//          url: 'http://localhost:8080/price',						
//          success: function(data) {
//              alert("sucess");
//          }
//      });
//	  
//	 	$.getJSON("price.json", function(json) {
//	 	    alert(json); 
//	 	})
	 	
	 	var text = '{"flight":"1000", "bus":"600", "train":"400"}';

	 	obj = JSON.parse(text);
	 	//var s=obj.employees[0]+"."+vehicle;
	 	if(vehicle=="Flight"){
	 		var totalprice=headcount*(obj.flight);

	 	}
	 	else if(vehicle=="Bus"){
	 		var totalprice=headcount*(obj.bus);

	 	}
	 	else if(vehicle=="Train"){
	 	var totalprice=headcount*(obj.train);
	 	}
	 	document.getElementById("price").innerHTML = totalprice;
  
  
  }
});