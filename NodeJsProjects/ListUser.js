var express = require('express');
var app = express();
var fs = require("fs");
var k="user2";
app.get('/listUsers', function (req, res) {
   fs.readFile( __dirname + "/" + "user.json", 'utf8', function (err, data) {
   	   data = JSON.parse( data );    
	   var user = data["user3"]; 
       console.log( user );
       res.end( JSON.stringify(user));
       
      
       
       
   });
});

 app.listen(8081);