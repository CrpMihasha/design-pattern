package decorator.after;

import decorator.Beverage;

public class StarBazz {
    public static void main(String[] args) {
        // 要一杯加了牛奶和抹茶的首选咖啡
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Milk(houseBlend);

        System.out.println(houseBlend.getDescrption());
        System.out.println(houseBlend.cost());
    }
}
