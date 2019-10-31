package observer;

public class Program {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student liLei = new Student("LiLei");
        Student lianJie = new Student("LianJie");
        Student wangZhao = new Student("WangZhao");

        teacher.registerObserver(liLei);
        teacher.registerObserver(lianJie);
        teacher.registerObserver(wangZhao);

        teacher.set_phone("12345");
        lianJie.show();
        liLei.show();
        wangZhao.show();

        teacher.removeObserver(wangZhao);
        teacher.set_phone("54321");
        lianJie.show();
        liLei.show();
        wangZhao.show();
    }
}
