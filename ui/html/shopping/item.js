const server = require('express').Router();
const item_service = require('./itemservice').itemservice;
const iservice = new item_service();
const setContentHeader = require('./utils').setContentHeader;
//to create display api
server.get('/display', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        item: iservice.all()
    }));
});
//to create add api
server.post('/add', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        items: iservice.add(req.body)
    }));
});
//to create nextid api
server.get('/nextId', (req, res) => {
    setContentHeader(res);
    res.end(JSON.stringify({
        nextId: iservice.nextId()
    }));
});
module.exports.itemroutes = server;