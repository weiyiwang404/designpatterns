package singleton;

/**
 * @ClassName Main
 * @Description:
 * @Author wangwy
 * @Date 2020/7/6 9:56
 * @Version 1.0
 */
public class Main {
    public static void main (String[] args) {
        Singleton07 a = Singleton07.INSTANCE;
        Singleton07 b = Singleton07.INSTANCE;
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        a.say();

    }
}
