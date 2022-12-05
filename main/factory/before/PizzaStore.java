package factory.before;

import factory.Pizza;

public class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = null;
        /**
         *  根据传入的类型不同，创建不同的pizza
         *  会导致的问题
         *  1、如果新增pizza，需要修改运行的代码
         *  2、现在是面向过程编程，不是面向对象编程
         */
        if (type == "NY") {

        } else if (type == "HL") {

        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
        return pizza;
    }
}
