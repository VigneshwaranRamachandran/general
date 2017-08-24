var events = require('events');
var eventEmitter = new events.EventEmitter();

var listner1 = function listner1() {
	console.log('listner1 executed.');
}

var listner2 = function listner2() {
	console.log('listner2 executed.');
}
// call the emiterOn
eventEmitter.addListener('connection', listner1);
//call the emiterOn
eventEmitter.on('connection', listner2);

var eventListeners = require('events').EventEmitter.listenerCount(eventEmitter,'connection');
console.log(eventListeners + " Listner(s) listening to connection event");

eventEmitter.emit('connection');

eventEmitter.removeListener('connection', listner2);
console.log("Listner1 will not listen now.");

eventEmitter.emit('connection');

eventListeners = require('events').EventEmitter.listenerCount(eventEmitter,'connection');
console.log(eventListeners + " Listner(s) listening to connection event");

console.log("Program Ended.");