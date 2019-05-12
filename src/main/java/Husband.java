import java.util.ArrayList;
import java.util.List;

public class Husband {
   private List<Product> allProducts;
   private List<Product> needToBuyProducts;
   private List<Product> boughtProducts;

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public List<Product> getNeedToBuyProducts() {
        return needToBuyProducts;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void createListOfNeedProducts(Wife wife) {
        needToBuyProducts = wife.getNeedToBayProducts();
   }

   public Husband(){
       allProducts = new ArrayList<Product>();
       boughtProducts = new ArrayList<Product>();
       needToBuyProducts = new ArrayList<Product>();
   }

    public Husband(Shop shop){
        allProducts = shop.getProducts();
        boughtProducts = new ArrayList<Product>();
        needToBuyProducts = new ArrayList<Product>();
    }

    public void addShops(Shop shop){
        allProducts.addAll(shop.getProducts());

    }

    public void createBoughtProductsList(){
        for (Product product: allProducts) {
            for (Product product1: needToBuyProducts) {
                if (product.getNameOfProduct().equals(product1.getNameOfProduct()))
                {
                    boughtProducts.add(product);
                }
            }
        }
    }

    public int getPriceOfBoughtProducts() {
        int result = 0;
        int price = 0;
        for (Product product: boughtProducts) {
            price = product.getPriceOfProduct();
            result = result + price;
        }
        return result;
    }
}


