import java.util.ArrayList;
import java.util.List;

public class Husband {
   private List<Product> allProducts;
   private List<Product> needToBuyProducts;
   private List<Product> boughtProducts;

   public List<Product> createListOfNeedProducts() {
       Wife wife = new Wife(needToBuyProducts);
       needToBuyProducts = wife.createListOfNeedProducts();
       return needToBuyProducts;
   }

    public Husband(){
        allProducts = new ArrayList<Product>();
        boughtProducts = new ArrayList<Product>();
    }

    public List<Product> createAllProductsList(List<Product> products){
        Husband husband = new Husband();
        husband.createListOfNeedProducts();
        for (int i = 0; i < products.size(); i++) {
            allProducts.add(products.get(i));
        }
        return allProducts;
    }

    public List<Product> doShopping(){
        for (Product product: allProducts) {
            for (Product product1: needToBuyProducts) {
                String name1 =  product.getNameOfProduct();
                String name2 = product1.getNameOfProduct();
                if (name1.equals(name2))
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


