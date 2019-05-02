import java.util.ArrayList;
import java.util.List;

public class TechnicsShop implements Shop {
   private List<Product> technics = new ArrayList<Product>();

    public List<Product> getProducts() {
        return technics;
    }

    public TechnicsShop(){
        this.technics = new ArrayList<Product>();
    }

    public void createProducts(){
        technics.add(new Product("Sony",150));
        technics.add(new Product("Sumsung",120));
        technics.add(new Product("Asus",100));
    }
}
