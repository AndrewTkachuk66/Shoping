import java.util.ArrayList;
import java.util.List;

public class TechnicsShop implements IShop {
   private List<Product> technics = new ArrayList<Product>();

    public List<Product> getProducts() {
        return technics;
    }

    public TechnicsShop(){
        this.technics = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        technics.add(product);
    }
}
