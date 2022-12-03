package decorator.before;

import decorator.Beverage;

import java.math.BigDecimal;

/**
 * 问题：
 * 1、如果有很多饮料产品，意味着，每有一个产品就会增加一个类，会发生类爆炸
 * 2、调料（牛奶、抹茶）的价格变化，要修改cost方法
 * 3、如果新增加调料，要修改基类代码
 * 4、并不是所有饮料都需要基类中的调料
 * 5、要加双倍调料该如何处理
 *
 * 装饰者模式要点: 这是其中一款饮料，加了奶昔和抹茶。
 */
public class HouseBlendWithStreamedMilkAndMocha extends Beverage {
    @Override
    public String getDescrption() {
        return "Milk and mocha Coffee";
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.ZERO;
    }
}
