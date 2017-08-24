var http = require('http');
var dt = require('./name');

http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.write(dt.mynamestring+":without function:"+dt.myname+"::"+dt.myDateTime+"");
    res.write(dt.mynamestring()+"::"+dt.myname()+"::"+dt.myDateTime()+"\n");
    res.write(dt.names+"\n");
    res.write(dt.direct);
    res.end();
}).listen(8081);