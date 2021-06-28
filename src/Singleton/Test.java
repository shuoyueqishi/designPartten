package Singleton;

public class Test {
    public static void main(String[] args) {
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("singleton1 == singleton2");
        } else {
            System.out.println("singleton1 1= singleton2");
        }

        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println("线程1："+instance);
        }).start();

        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println("线程2："+instance);
        }).start();

        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println("线程3："+instance);
        }).start();


        new Thread(()->{
            StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
            System.out.println("线程4："+instance);
        }).start();

        new Thread(()->{
            StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
            System.out.println("线程5："+instance);
        }).start();

        new Thread(()->{
            StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
            System.out.println("线程6："+instance);
        }).start();

    }
}
