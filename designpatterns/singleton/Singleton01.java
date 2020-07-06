package singleton;

/**
 * 饿汉模式-静态常量
 * 1)优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 2)缺点：在类装载的时候就完成实例化，没有达到Lazy loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
 * 3)这种方式基于classloader机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用
 * getInstance方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初
 * 始化instance就没有达到lazy loading的效果
 * 4)结论：这种单例模式可用，可能造成内存浪费
 *
 * @ClassName Singleton01
 * @Description:
 * @Author wangwy
 * @Date 2020/7/6 9:51
 * @Version 1.0
 */
public class Singleton01 {
    // 1.构造器私有化，外部不能访问
    private Singleton01 () {

    }

    // 2.本类内部创建对象实例
    private final static Singleton01 instance = new Singleton01();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton01 getInstance () {
        return instance;
    }
}

