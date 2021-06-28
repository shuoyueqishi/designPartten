package Singleton;

/**
 * 饿汉模式单例
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton() {
        System.out.println("饿汉单例-生成了一个实例");
    }
    public static HungrySingleton getInstance() {
        return singleton;
    }
}
