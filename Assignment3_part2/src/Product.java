public class Product {

    //private attributes
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;

    //constructor
    public Product(){
        this.productId = "A1";
        this.productName = "product Name";
        this.price = 150.99;
        this.inStock = false;
    }

    //setter methods
    public void setPrice(double newPrice){
        System.out.println("Current/Old Price: " + price );
        if (newPrice < 0){
            System.out.println("Error");
        } else {
            price = newPrice;
            System.out.println("Updated Price: " + price );
        }
    }

    public void setInStock(boolean status){
        System.out.println("Current/Old isInStock? " +  inStock);
        inStock = status;
        System.out.println("Updated isInStock? " +  inStock);
    }

    //getter methods
    public String getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public boolean isInStock(){
        return inStock;
    }
}
