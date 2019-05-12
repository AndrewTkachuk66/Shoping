import java.util.ArrayList;
import java.util.List;

public class FoodShop implements IShop {
    private List<Product> food;

    public List<Product> getProducts() {
        return food;
    }

    public FoodShop(){
        this.food = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        food.add(product);
    }
}
