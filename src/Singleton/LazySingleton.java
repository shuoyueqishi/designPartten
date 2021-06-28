package Singleton;

public class LazySingleton {
    /**
     * 1、内存可见性
     * 2、避免指令重排序
     */
    volatile private static LazySingleton instance;
    private LazySingleton(){
        System.out.println("懒汉单例-生成了一个实例");
    }

    public static LazySingleton getInstance() {
        // 判断实例是否存在
        if (instance == null) {
            synchronized (LazySingleton.class) {
                // 当前线程获得锁，判断是否存在实例；其他线程被阻塞
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
