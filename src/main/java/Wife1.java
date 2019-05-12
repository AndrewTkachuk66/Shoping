import java.util.ArrayList;
import java.util.List;

public class Wife1 implements IWife {
   private List<Product> needToBayProducts = new ArrayList<Product>();

   public void addProduct(Product product){
       needToBayProducts.add(product);
   }

    public List<Product> getNeedToBayProducts() {
        return needToBayProducts;
    }
}
