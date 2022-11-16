package strategy.duck.after;

public class FlyWithRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("FlyWithRocket");
    }
}
