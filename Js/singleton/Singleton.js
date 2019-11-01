var Singleton = /** @class */ (function () {
    function Singleton() {
        console.log("Singleton class");
    }
    Singleton.getInstance = function () {
        if (this.singleton === undefined) {
            this.singleton = new Singleton();
        }
        return this.singleton;
    };
    return Singleton;
}());
