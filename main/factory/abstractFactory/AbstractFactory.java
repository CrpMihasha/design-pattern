package factory.abstractFactory;

/**
 * 抽象工厂用来生产一个产品组，这里用来生产pizza的原材料
 */
public abstract class AbstractFactory {
    public abstract void createDough();
    public abstract void createSauce();
    public abstract void createCheese();
}
