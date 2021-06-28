package Singleton;

/**
 * 静态内部类单例
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}
    private static class InstanceHolder{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
