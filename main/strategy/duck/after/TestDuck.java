package strategy.duck.after;

public class TestDuck {
    public static void main(String[] args) {
        Duck duck0 = new MallardDuck();
        duck0.swim();
        duck0.display();
        duck0.performFly();
        duck0.performQuack();

        System.out.println("---");

        Duck duck1 = new RubberDuck();
        duck1.swim();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
    }
}
