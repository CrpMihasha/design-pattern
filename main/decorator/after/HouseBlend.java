package decorator.after;

import decorator.Beverage;

import java.math.BigDecimal;

/**
 * 这是饮料的一种
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescrption() {
        return "HouseBlend";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(0.1F);
    }
}
