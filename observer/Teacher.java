package observer;

import java.util.ArrayList;

public class Teacher implements Subject {
    private String _phone;

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
        notifyObserver();
    }

    public Teacher() {
        stuList = new ArrayList<>();
    }

    private ArrayList stuList;

    @Override
    public void registerObserver(Observer o) {
        stuList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        stuList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Object o : stuList) {
            ((Observer)o).update(get_phone());
        }

    }
}
