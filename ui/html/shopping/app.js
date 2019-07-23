const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');
const itemroutes = require('./item').itemroutes;
const setContentHeader = require('./utils').setContentHeader;

server.use(parser.json());

server.use(cors());

server.get('/status', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        message: "Server is RUNNING"
    }));
});
server.use('/item', itemroutes);

server.listen(3369, () => {
    console.log('Server started at 3369');
});