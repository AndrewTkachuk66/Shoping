import java.util.ArrayList;
import java.util.List;

public class Wife {
   private List<Product> needToBayProducts;

   public Wife(){
       needToBayProducts = new ArrayList<Product>();
   }

    public List<Product> getNeedToBayProducts() {
        return needToBayProducts;
    }

    public List<Product> createListOfNeedProducts(){
       needToBayProducts.add(new Product("Bread",12));
       needToBayProducts.add(new Product("Asus", 120));
       needToBayProducts.add(new Product("Panasonic", 120));

        return needToBayProducts;
   }


}
