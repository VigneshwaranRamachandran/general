
function Welcome(){}
Welcome.annotations=[
	
	new angular.ComponentAnnotation({
		selector:"first"
	}),
	new angular.ViewAnnotation({
		template:"<h1>welcome</h1>"
	})
];

document.addEventListener("DOMContentLoaded",function(){
	angular.bootstrap(Welcome);
})