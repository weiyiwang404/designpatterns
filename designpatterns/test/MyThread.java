package test;

/**
 * @ClassName MyThread
 * @Description:
 * @Author wangwy
 * @Date 2020/7/7 16:21
 * @Version 1.0
 */
public class MyThread extends Thread {

    private int count = 5;

    /*public MyThread (String name) {
        super();
        this.setName(name);
    }*/

    @Override
    public synchronized void run () {
        super.run();
        count--;
        System.out.println("由 " + MyThread.currentThread().getName() + " 计算，count=" + count);
    }
}
