import java.util.ArrayList;
import java.util.List;

public class FoodShop implements Shop {
    private List<Product> food;

    public List<Product> getProducts() {
        return food;
    }

    public FoodShop(){
        this.food = new ArrayList<Product>();
    }

    public void createProducts(){
        food.add(new Product("Bread",20));
        food.add(new Product("Meat",150));
        food.add(new Product("Milk",40));
    }
}
