var Teacher = /** @class */ (function () {
    function Teacher() {
        this.stuList = new Array();
    }
    Teacher.prototype.get_phone = function () {
        return this._phone;
    };
    Teacher.prototype.set_phone = function (phone) {
        this._phone = phone;
        this.notifyObserver();
    };
    Teacher.prototype.registerObserver = function (o) {
        this.stuList.push(o);
    };
    Teacher.prototype.removeObserver = function (o) {
        this.stuList = this.stuList.filter(function (item) { console.log(item !== o); return item !== o; });
    };
    Teacher.prototype.notifyObserver = function () {
        var _this = this;
        this.stuList.forEach(function (item) {
            item.update(_this.get_phone());
        });
    };
    return Teacher;
}());
