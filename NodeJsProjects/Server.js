var http = require('http');  
var fs = require('fs');  
var url = require('url');  
var j=0;  
var i=3;
console.log("initialize finished");
http.createServer( function (request, response) {    
   var pathname = url.parse(request.url).pathname; 
   fs.readFile(pathname.substr(i), function (err, data) {  
	  i--;
	   j++;
	   console.log(j+": "+i);
	     if(i===0){i=3;}
      if (err) {  
         response.writeHead(404, {'Content-Type': 'text/html'});
         response.end("<html><body><br><br><br><br><br><br><center>ERROR 404,PAGE NOT FOUND</center>" +
         		"<br><br><center><img src='pic_mountain.jpg'  style='width:304px;height:228px;'></center>" +
         		"</body></html>"); 
      }
      else{      
          
          response.writeHead(200, {'Content-Type': 'text/html'});      
            
         
          response.write(data.toString());         
       }  
     
       response.end();    
      
  }); 
  }).listen(8081);  

console.log('Server running at http://localhost:8081/');  