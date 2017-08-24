var events = require('events');

var eventEmitter = new events.EventEmitter();
//third controll
 function connected() {
	console.log('connection succesful.');

	eventEmitter.emit('data_received');
	console.log('succesful.');
}
//second controll
eventEmitter.on('connection', connected);
//fourth controll
eventEmitter.on('data_received', function() {
	console.log('data received succesfully.');
});
// first controll
eventEmitter.emit('connection');

console.log("Program Ended.");