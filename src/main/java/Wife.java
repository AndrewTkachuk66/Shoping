import java.util.ArrayList;
import java.util.List;

public class Wife {
   private List<Product> needToBayProducts = new ArrayList<Product>();

   public Wife(){}

   public Wife(List<Product> needToBayProducts){
       this.needToBayProducts = needToBayProducts;
   }

   public void addProduct(Product product){
       needToBayProducts.add(product);
   }

    /*public void createListOfNeedProducts(){
       needToBayProducts.add(new Product("Bread",12));
       needToBayProducts.add(new Product("Asus", 120));
       needToBayProducts.add(new Product("Panasonic", 120));
   }*/

    public List<Product> getNeedToBayProducts() {
        return needToBayProducts;
    }
}
