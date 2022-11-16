package strategy.duck.after;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck Quack");
    }
}
