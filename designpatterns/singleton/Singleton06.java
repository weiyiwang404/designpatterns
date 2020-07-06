package singleton;

/**
 * 1)这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 2)静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才会装载 SingletonInstance
 * 类，从而完成 Singleton 的实例化。
 * 3)类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 4)优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5)结论：推荐使用。
 *
 * @ClassName Singleton06
 * @Description:
 * @Author wangwy
 * @Date 2020/7/6 10:14
 * @Version 1.0
 */
public class Singleton06 {
    private static volatile Singleton06 instance;

    //构造器私有化
    private Singleton06 () {
    }

    //写一个静态内部类,该类中有一个静态属性
    private static class SingletonInstance {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    //提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static synchronized Singleton06 getInstance () {
        return SingletonInstance.INSTANCE;
    }
}