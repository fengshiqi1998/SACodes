class Student implements Observer {
  private _name: String;
  private _tPhone: String;

  constructor(name) {
    this.set_name(name);
  }

  public set_name(name: String): void {
    this._name = name;
  }
  public get_name(): String {
    return this._name;
  }

  public set_tPhone(tPhone: String): void {
    this._tPhone = tPhone;
  }
  public get_tPhone(): String {
    return this._tPhone;
  }

  public update(o:Object) {
    this.set_tPhone(<String>o);
  }

  public show(): void {
    console.log(`Name: ${this.get_name()}\nTeacher's Phone: ${this.get_tPhone()}`);
  }
}