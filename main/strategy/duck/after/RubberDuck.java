package strategy.duck.after;

public class RubberDuck extends Duck{
    RubberDuck (){
        fly = new FlyWithRocket();
        quack = new Squeak();
    }
}
