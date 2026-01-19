public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("********* Initial Details *********");
        print_data(p1);

        System.out.println("********* setting invalid price *********");
        p1.setPrice(-230.50);
        System.out.println("********* Updated Data *********");
        print_data(p1);

        System.out.println("********* setting valid price *********");
        p1.setPrice(225.25);
        System.out.println("********* Updated Data *********");
        print_data(p1);

        System.out.println("********* Changing the Status *********");
        p1.setInStock(true);
        System.out.println("********* Updated Data *********");
        print_data(p1);

    }

    public static void print_data(Product p){
        System.out.println("Initial Product Name: " + p.getProductName());
        System.out.println("Initial Product ID: " + p.getProductId());
        System.out.println("Initial Product Price: " + p.getPrice());
        System.out.println("Initial Product Status: " + p.isInStock());
    }
}
