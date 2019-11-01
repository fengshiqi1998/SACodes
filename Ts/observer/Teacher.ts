class Teacher implements Subject {
  private _phone: String;
  private stuList: Array<any>;
  constructor() {
    this.stuList = new Array<Observer>();
  }
  public get_phone(): String {
    return this._phone;
  }
  public set_phone(phone: String): void {
    this._phone = phone;
    this.notifyObserver();
  }
  registerObserver(o: Observer) {
    this.stuList.push(o);
  }
  removeObserver(o: Observer) {
    this.stuList = this.stuList.filter(item => item !== o);
  }
  notifyObserver() {
    this.stuList.forEach(item => {
      item.update(this.get_phone());
    })
  }

  
}