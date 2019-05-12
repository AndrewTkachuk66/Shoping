import java.util.ArrayList;
import java.util.List;

public interface Shop {
    List<Product> getProducts();

    void addProduct(Product product);
    //void createProducts();
}
