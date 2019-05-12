import java.util.ArrayList;
import java.util.List;

public class Husband {
   private List<Product> allProducts = new ArrayList<Product>();
   private List<Product> needToBuyProducts = new ArrayList<Product>();
   private List<Product> boughtProducts = new ArrayList<Product>() ;

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public List<Product> getNeedToBuyProducts() {
        return needToBuyProducts;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public Husband(IShop IShop){
        allProducts = IShop.getProducts();
        boughtProducts = new ArrayList<Product>();
        needToBuyProducts = new ArrayList<Product>();
    }

    public void createListOfNeedProducts(IWife iWife) {
        needToBuyProducts = iWife.getNeedToBayProducts();
   }

    public void addShop(IShop iShop){
        allProducts.addAll(iShop.getProducts());

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
            result += price;
        }
        return result;
    }
}


