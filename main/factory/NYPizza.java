package factory;

public class NYPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("NYPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("NYPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("NYPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NYPizza box");
    }
}
