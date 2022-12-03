package decorator.after;

import decorator.Beverage;

import java.math.BigDecimal;

/**
 * 这是一个调料装饰者
 */
public class CondimentDecorator extends Beverage {
    @Override
    public String getDescrption() {
        return null;
    }

    @Override
    public BigDecimal cost() {
        return null;
    }
}
