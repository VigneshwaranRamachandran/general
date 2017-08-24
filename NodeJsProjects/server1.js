var express = require('express');
var app = express.createServer();

app.use(express.bodyParser());

/*app.get('/endpoint', function(req, res){
	var obj = {};
	obj.title = 'title';
	obj.data = 'data';
	
	console.log('params: ' + JSON.stringify(req.params));
	console.log('body: ' + JSON.stringify(req.body));
	console.log('query: ' + JSON.stringify(req.query));
	
	res.header('Content-type','application/json');
	res.header('Charset','utf8');
	res.send(req.query.callback + '('+ JSON.stringify(obj) + ');');
});*/


app.post('/price', function(req, res){
	 fs.readFile( __dirname + "/" + "price.json", 'utf8', function (err, data) {
	   	   data = JSON.parse( data ); 
	   	   var v=req.body.v;
	   	   var h=req.body.h;
		   var user = data[v]; 
	       console.log(v+" :: "+h+" :: "+user);
	       
	      
	       
	       
	   });
	res.send(user);
});


app.listen(3000);