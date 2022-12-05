package factory.simple.factory;

import factory.Pizza;

public class PizzaStore {
    private SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    /**
     * 这里引入简单工厂来创建pizza，如果新增了pizza类型，预定pizza的代码不需要做任何修改
     *
     */
    public void orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
    }
}
