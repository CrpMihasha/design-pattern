package strategy.duck.before;

abstract class Duck {
    public void swim(){
        System.out.println("Duck swimming");
    }
    public void fly(){
        System.out.println("Duck flying");
    }
    public void quack(){
        System.out.println("Duck quacking");
    }

    public void display(){
        System.out.println("I'm a duck");
    }
}