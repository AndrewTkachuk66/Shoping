import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop foodShop = new FoodShop();
        Shop technicsShop = new TechnicsShop();

        technicsShop.addProduct(new Product("Sony",150));
        technicsShop.addProduct(new Product("Samsung",120));
        technicsShop.addProduct(new Product("Asus",100));

        foodShop.addProduct(new Product("Bread",20));
        foodShop.addProduct(new Product("Meat",150));
        foodShop.addProduct(new Product("Milk",40));

        Wife wife = new Wife();
        wife.addProduct(new Product("Bread",12));
        wife.addProduct(new Product("Asus", 120));
        wife.addProduct(new Product("Panasonic", 120));


        Husband husband = new Husband(foodShop);
        husband.addShops(technicsShop);
        husband.createListOfNeedProducts(wife);
        husband.createBoughtProductsList();

        System.out.println("All products: " + husband.getAllProducts());
        System.out.println("Need to bay products" + husband.getNeedToBuyProducts());
        System.out.println("Bought products: " + husband.getBoughtProducts());
        System.out.println("Total price: " + husband.getPriceOfBoughtProducts());

    }
}
