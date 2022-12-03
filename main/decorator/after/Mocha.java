package decorator.after;

import decorator.Beverage;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator{
    private final Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescrption() {
        return "Mocha" + beverage.getDescrption();
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.2F).add(beverage.cost());
    }
}
