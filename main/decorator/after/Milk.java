package decorator.after;

import decorator.Beverage;

import java.math.BigDecimal;

public class Milk extends CondimentDecorator{
    private final Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescrption() {
        return "Milk" + beverage.getDescrption();
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.05F).add(beverage.cost());
    }
}
