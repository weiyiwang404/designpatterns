package singleton;

/**
 * 1)Double-Check 概念是多线程开发中常使用到的，如代码中所示，我们进行了两次 if (singleton == null)检查，这样就可以保证线程安全了。
 * 2)这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避免的反复进行方法同步.
 * 3)线程安全；延迟加载；效率较高
 * 4)结论：在实际开发中，推荐使用这种单例设计模式
 *
 * @ClassName Singleton05
 * @Description:
 * @Author wangwy
 * @Date 2020/7/6 10:14
 * @Version 1.0
 */
public class Singleton05 {
    private static Singleton05 instance;

    private Singleton05 () {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题同时保证了效率, 推荐使用
    public static synchronized Singleton05 getInstance () {
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}