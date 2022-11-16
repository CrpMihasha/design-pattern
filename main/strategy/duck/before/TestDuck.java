package strategy.duck.before;

public class TestDuck {
    public static void main(String[] args) {
        // 变量类型为超类，面向接口编程
        Duck mallardDuck = new MallardDuck();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println("----");

        // 变量类型为超类，面向接口编程
        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.quack();
    }
}
