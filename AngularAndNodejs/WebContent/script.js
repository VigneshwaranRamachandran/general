var app = angular.module('mainApp', []);

app.controller('ticketController', function($scope) {
  $scope.something = function(form) {
	  
	 	  var vehicle=document.getElementById("vehicle").value;
	 	 var headcount=document.getElementById("headcount").value;
	  //alert(d2);
   //alert(d);
	  var data = {};
		data.v = vehicle;
		data.h =headcount;
		
		$.ajax({
			type: 'GET',
			data: JSON.stringify(data),
	        contentType: 'application/json',
          url: 'http://localhost:8080/price',						
          success: function(data) {
              alert("sucess");
          }
      });
	  
  }
});