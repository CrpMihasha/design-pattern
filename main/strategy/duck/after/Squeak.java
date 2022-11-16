package strategy.duck.after;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck Squeak");
    }
}
