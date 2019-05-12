public class Main {
    public static void main(String[] args) {
        IShop foodIShop = new FoodShop();
        IShop technicsIShop = new TechnicsShop();

        technicsIShop.addProduct(new Product("Sony",150));
        technicsIShop.addProduct(new Product("Samsung",120));
        technicsIShop.addProduct(new Product("Asus",100));

        foodIShop.addProduct(new Product("Bread",20));
        foodIShop.addProduct(new Product("Meat",150));
        foodIShop.addProduct(new Product("Milk",40));

        IWife wife1 = new Wife1();
        wife1.addProduct(new Product("Bread",12));
        wife1.addProduct(new Product("Asus", 120));
        wife1.addProduct(new Product("Panasonic", 120));

        IWife wife2 = new Wife2();
        wife2.addProduct(new Product("Milk", 40));
        wife2.addProduct(new Product("Sony", 150));

        Husband husband = new Husband(foodIShop);
        husband.addShop(technicsIShop);
        husband.createListOfNeedProducts(wife1);
        husband.createBoughtProductsList();

        System.out.println("All products: " + husband.getAllProducts());
        System.out.println("Need to bay products form first wife: " + husband.getNeedToBuyProducts());
        husband.createListOfNeedProducts(wife2);
        husband.createBoughtProductsList();
        System.out.println("Need to bay products from second wife: " + husband.getNeedToBuyProducts());
        System.out.println("Bought products: " + husband.getBoughtProducts());
        System.out.println("Total price: " + husband.getPriceOfBoughtProducts());

    }
}
