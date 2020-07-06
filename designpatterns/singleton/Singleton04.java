package singleton;

/**
 * 懒汉模式（线程安全，同步方法）
 * 1)解决了线程安全问题。
 * 2)效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行一
 * 次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * 3)结论：在实际开发中，不推荐使用这种方式.
 *
 * @ClassName Singleton04
 * @Description:
 * @Author wangwy
 * @Date 2020/7/6 10:14
 * @Version 1.0
 */
public class Singleton04 {
    private static Singleton04 instance;

    private Singleton04 () {
    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton04 getInstance () {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;
    }
    /*public static SingletonTest04 getInstance () {
        if (instance == null) {
            synchronized (SingletonTest04.class) {
                instance = new SingletonTest04();
            }
        }
        return instance;
    }*/
}
