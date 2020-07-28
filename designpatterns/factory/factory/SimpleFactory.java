package factory.factory;

import factory.pizza.GreekPizza;
import factory.pizza.Pizza;

/**
 * @ClassName SimpleFactory
 * @Description:
 * @Author wangwy
 * @Date 2020/7/8 15:57
 * @Version 1.0
 */
public class SimpleFactory {

    //更加 orderType 返回对应的 Pizza 对象
    public Pizza createPizza (String orderType) {


        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } /*else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }*/
        return pizza;
    }
}
