package factory.simple.factory;

import factory.HGPizza;
import factory.NYPizza;
import factory.Pizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        if (type == "NY") {
            return new NYPizza();
        } else if(type == "HG") {
            return new HGPizza();
        }
        return null;
    }
}
