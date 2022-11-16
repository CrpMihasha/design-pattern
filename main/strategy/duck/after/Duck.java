package strategy.duck.after;

abstract class Duck {
    // 这里体现了面向接口编程，因为定义的成员是一个接口,运行时，可以指定为任意的子类，通过getter/setter可以方便的改变鸭子的行为
    FlyBehavior fly;
    // 这里体现了面向接口编程，因为定义的成员是一个接口,运行时，可以指定为任意的子类，通过getter/setter可以方便的改变鸭子的行为
    QuackBehavior quack;

    public void swim(){
        System.out.println("Duck swimming");
    }
    public void display(){
        System.out.println("I'm a duck");
    }

    /**
     * 运行时，可以指定为任意的子类
     */
    public void performFly() {
        fly.fly();
    };

    /**
     * 运行时，可以指定为任意的子类
     */
    public void performQuack() {
        quack.quack();
    };

    public FlyBehavior getFly() {
        return fly;
    }

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public QuackBehavior getQuack() {
        return quack;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }
}