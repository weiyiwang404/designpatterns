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
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance1 = Singleton06.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance1.hashCode=" + instance1.hashCode());
    }
}
