import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    protected HashMap<Product,Integer> items;

    public Cart(){
        items = new HashMap<>(); //it initilizes an empty cart when new cart is created
    }

    public void addItem(Product product , int quantity){
        items.put(product , items.getOrDefault(product,0) + quantity);
    }

    public void removeItem(Product product){
        items.remove(product);
    }

    public double calculateTotalPrice(){
        double totalPrice =0;
        for (Map.Entry<Product , Integer> entry : items.entrySet()){
            totalPrice += entry.getKey().getProductPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void displayCart(){
        if (items.isEmpty()){
            System.err.println("Cart is Empty");
        }
        else {
            System.err.println("Items in the cart :: ");
            for (Map.Entry<Product,Integer> entry : items.entrySet()){
                Product key = entry.getKey();
                Integer value = entry.getValue();
                //System.out.println(entry.getKey() + "| Quantity: " + entry.getValue());
                System.out.println(key + "| Quantity : " + value);
            }
        }
    }
}
