package strategy.duck.before;

/**
 * 这是一只橡皮鸭，它不会飞，也不会呱呱叫，只会吱吱叫，但是会游泳
 */
public class RubberDuck extends Duck{
    @Override
    public void fly() {
        // 因为不会飞，所以这里什么也不做
    }

    @Override
    public void quack() {
        System.out.println("Duck squeaking");
    }
}
