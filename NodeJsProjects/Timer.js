setInterval(function() {  
console.log("setInterval: Hey! 1 millisecond completed!..");   
}, 1000);  

var i =0;  
console.log(i+"something");  
setInterval(function(){  
i++;  
console.log(i);  
}, 1000);   