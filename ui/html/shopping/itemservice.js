const items = require('./items').items;
class itemservice {
    constructor() {
            this.items = items;
        }
        // to display all items
    all() {
            return this.items;
        }
        // to add  items
    add(it_em) {
            this.items.push(it_em);
            return this.items;
        }
        // to create nextid
    nextId() {
        return this.items.length + 1;
    }
}
module.exports.itemservice = itemservice;