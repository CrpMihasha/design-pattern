package factory.factory.method;

import factory.Pizza;

public abstract class PizzaStore {


    public void orderPizza(String type) {

        /**
         * 此处的工厂是工厂方法，由具体的子类来实例化创建pizza的方法
         */
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();
    }

    protected abstract Pizza createPizza(String type) ;
}
