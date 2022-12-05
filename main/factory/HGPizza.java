package factory;

public class HGPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("HGPizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("HGPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("HGPizza cut");
    }

    @Override
    public void box() {
        System.out.println("HGPizza box");
    }
}
