import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodShop foodShop = new FoodShop();
        TechnicsShop technicsShop = new TechnicsShop();
        Husband husband = new Husband();
        foodShop.createProducts();
        //System.out.println("Food: " + foodShop.getProducts());
        technicsShop.createProducts();
        //System.out.println("Technics:" + technicsShop.getProducts());
        System.out.println("Need to buy list: " + husband.createListOfNeedProducts());
        husband.createAllProductsList(technicsShop.getProducts());
        System.out.println("All products: " + husband.createAllProductsList(foodShop.getProducts()));
        System.out.println("Bought products: " + husband.doShopping());
        System.out.println("Total price: " + husband.countPriceOfBoughtProducts());
    }
}
