var express = require('express');
var app = express();
var path = require("path");
var mysql = require("mysql");
var http = require('http').Server(app);
var io = require('socket.io')(http);
var router = express.Router();


/* Creating POOL MySQL connection.*/

var pool = mysql.createPool({
    connectionLimit: 100,
    host: 'localhost',
    user: 'admin',
    password: 'lembani5p',
    database: 'socketDemo',
    debug: true
});


var db = require("./db");
var routes = require("../Routes/")(router, mysql, pool);

app.use('/', router);

http.listen(5555, function () {
    console.log("Listening on 5555");
});

io.on('connection', function (socket) {
    console.log('Client connected!');
    socket.on('comment added', function (data) {
        db.addComment(data.user, data.comment, mysql, pool, function (error, result) {
            if (error) {
                console.log(error);
                io.emit('error');
            } else {
                socket.broadcast.emit("notify everyone", {user: data.user, comment: data.comment});
            }
        });
    });
});
