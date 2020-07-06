package singleton;

/**
 * 饿汉模式-静态代码块
 * 优缺点同饿汉模式-静态常量
 *
 * @ClassName Singleton02
 * @Description:
 * @Author wangwy
 * @Date 2020/7/6 10:09
 * @Version 1.0
 */
public class Singleton02 {
    // 1. 构造器私有化
    private Singleton02 () {
    }

    //2.本类内部创建对象实例
    private static Singleton02 instance;

    // 在静态代码块中，创建单例对象
    static {
        instance = new Singleton02();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton02 getInstance () {
        return instance;
    }

}
