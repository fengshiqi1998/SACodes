package sigleton;

public class Singleton {
    // 使用静态私有全局变量保存唯一实例
    private static Singleton singleton;
    private Singleton() {
        System.out.println("Singleton class");
    }
    public static Singleton getInstance() {
        // 保证只会在第一次时实例化
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
