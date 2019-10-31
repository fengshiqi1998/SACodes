package observer;

public class Student implements Observer {
    private String _name;
    private String _tPhone;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_tPhone() {
        return _tPhone;
    }

    public void set_tPhone(String _tPhone) {
        this._tPhone = _tPhone;
    }

    public Student(String name) {
        set_name(name);
    }

    @Override
    public void update(Object o) {
        set_tPhone((String)o);
    }

    public void show() {
        System.out.println("Name: " +  get_name() + "\nTeacher's Phone: " + get_tPhone());
    }
}
