var Student = /** @class */ (function () {
    function Student(name) {
        this.set_name(name);
    }
    Student.prototype.set_name = function (name) {
        this._name = name;
    };
    Student.prototype.get_name = function () {
        return this._name;
    };
    Student.prototype.set_tPhone = function (tPhone) {
        this._tPhone = tPhone;
    };
    Student.prototype.get_tPhone = function () {
        return this._tPhone;
    };
    Student.prototype.update = function (o) {
        this.set_tPhone(o);
    };
    Student.prototype.show = function () {
        console.log("Name: " + this.get_name() + "\nTeacher's Phone: " + this.get_tPhone());
    };
    return Student;
}());
