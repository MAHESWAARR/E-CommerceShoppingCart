public class Product {
    private final int productID;
    private final String productName;
    private  double productPrice;
    private final String productCategory;

    public Product(int productID, String productName , double productPrice ,String productCategory){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public int getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }
    public String getProductCategory(){
        return productCategory;
    }

    @Override
    public String toString(){
        return "\nProducts {" +
                ", ProductID = "+ productID +
                ", ProductName = "+ productName +
                ", ProductPrice = " + productPrice +
                ", ProductCategory = " + productCategory + "}\n";
    }
}
