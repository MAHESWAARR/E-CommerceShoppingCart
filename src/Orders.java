import java.util.ArrayList;
import java.util.List;

public class Orders {
    private static int orderCounter = 1001 ;
    private final int orderId;
    private List<Product> products;
    private double totalOrderAmount;

    public Orders(List<Product> products , double totalOrderAmount){
        this.orderId = orderCounter++;
        this.products = new ArrayList<>(products);
        this.totalOrderAmount = totalOrderAmount;
    }

    public int getOrderId(){
        return orderId;
    }
    public List<Product> getProducts(){
        return products;
    }
    public double getTotalOrderAmount(){
        return totalOrderAmount;
    }

    public String toString(){
        return "\nPlaced Orders are{" +
                "\nOrderID : "+orderId+
                "\nproducts : "+products+
                "\nTotalOrderAmount  ₹:"+totalOrderAmount + " }";
    }

}
