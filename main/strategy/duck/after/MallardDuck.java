package strategy.duck.after;

public class MallardDuck extends Duck{
    MallardDuck () {
        fly = new FlyWithWings();
        quack = new Quack();
    }
}
