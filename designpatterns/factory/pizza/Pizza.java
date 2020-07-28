package factory.pizza;

/**
 * @ClassName Pizza
 * @Description:
 * @Author wangwy
 * @Date 2020/7/8 15:58
 * @Version 1.0
 */
public interface Pizza {

    // 准备
    public void ready ();

    // 制作
    public void make ();

    // 切片
    public void cut ();

    // 装盒
    public void box ();
}
