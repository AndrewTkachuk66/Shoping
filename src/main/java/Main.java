import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodShop foodShop = new FoodShop();
        TechnicsShop technicsShop = new TechnicsShop();
        Wife wife = new Wife();
        wife.createListOfNeedProducts();
        Husband husband = new Husband(wife.getNeedToBayProducts());
        foodShop.createProducts();
        //System.out.println("Food: " + foodShop.getProducts());
        technicsShop.createProducts();
        //System.out.println("Technics:" + technicsShop.getProducts());
        List<Product> totalList = husband.createAllProductsList(foodShop.getProducts(), technicsShop.getProducts());
        System.out.println("Total list:");
        for (Product product: totalList) {
            System.out.println(product);
        }
        List<Product> boughtProducts =  husband.doShopping();
        int totalPrice = husband.countPriceOfBoughtProducts();
        System.out.println("Bought products:");
        for (Product product: boughtProducts) {
            System.out.println(product);
        }
        System.out.println("Total price: " + totalPrice);

    }
}
