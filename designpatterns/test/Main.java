package test;

/**
 * @ClassName Main
 * @Description:
 * @Author wangwy
 * @Date 2020/7/7 16:21
 * @Version 1.0
 */
public class Main {
    public static void main (String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        long Start = System.currentTimeMillis();
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        System.out.println("================" + (System.currentTimeMillis() - Start));
    }

}
