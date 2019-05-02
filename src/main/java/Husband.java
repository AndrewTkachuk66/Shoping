import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Husband {
   private List<Product> allProducts;
   private List<Product> needToBuyProducts;
   private List<Product> boughtProducts;

    public Husband(){}

    public Husband(List<Product> needToBuyProducts){
        this.needToBuyProducts = needToBuyProducts;
        allProducts = new ArrayList<Product>();
        boughtProducts = new ArrayList<Product>();
    }

    public List<Product> createAllProductsList(List<Product> food, List<Product> technics){
        for (int i = 0; i < food.size(); i++) {
            allProducts.add(food.get(i));
        }
        for (int j = 0; j < technics.size() ; j++) {
            allProducts.add(technics.get(j));
        }
        return allProducts;
    }

    public List<Product> doShopping(){
        for (Product product: allProducts) {
            for (Product product1: needToBuyProducts) {
                String name1 =  product.getNameOfProduct();
                String name2 = product1.getNameOfProduct();
                if (name1==name2)
                {
                    boughtProducts.add(product);
                }
            }

        }
        return boughtProducts;
    }

    public int countPriceOfBoughtProducts() {
        int result = 0;
        int price = 0;
        for (int i = 0; i < boughtProducts.size(); i++) {
            price = boughtProducts.get(i).getPriceOfProduct();
            result = result + price;
        }
        return result;
    }

}


