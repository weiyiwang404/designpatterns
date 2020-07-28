package factory.pizza;

/**
 * @ClassName GreekPizza
 * @Description:
 * @Author wangwy
 * @Date 2020/7/8 16:01
 * @Version 1.0
 */
public class GreekPizza implements Pizza {
    String name;

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    @Override
    public void ready () {
        System.out.println(name + "准备中...");
    }

    @Override
    public void make () {
        System.out.println(name + "希腊披萨制作中...");
    }

    @Override
    public void cut () {
        System.out.println(name + "希腊披萨切片中...");
    }

    @Override
    public void box () {
        System.out.println(name + "希腊披萨装盒中...");
    }
}
