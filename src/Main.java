import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //creating some products(shop)
        Product product1 = new Product(1 ,"Laptop" ,77000.00, "Electronics");
        Product product2 = new Product(2,"Shirt",1204.50,"Clothing");
        Product product3 = new Product(3,"Milk",32.70,"Groceries");


        User user = new User(1001 , "Maahi");
        System.out.println("User Details: " + user);

        Cart cart = new Cart();
        cart.addItem(product1,2);
        cart.addItem(product3 ,3);

        cart.displayCart();

        double totalAmount = cart.calculateTotalPrice();
        System.out.println("Total Bill(₹): " + "₹"+ totalAmount);


        //checkout and creating order
        List<Product> purchasedProducts = new ArrayList<>(cart.items.keySet());
        Orders orders = new Orders(purchasedProducts ,totalAmount);
        System.out.println("---Order Placed---" + orders);
    }
}