public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(203, "Shoes", "Footwear"),
            new Product(150, "Book", "Stationery"),
            new Product(170, "Phone", "Electronics")
        };

        int searchId = 150;

        System.out.println("---- Linear Search ----");
        Product result1 = SearchEngine.linearSearch(products, searchId);
        if (result1 != null) System.out.println("Found: " + result1);
        else System.out.println("Product not found.");

        System.out.println("---- Binary Search ----");
        Product result2 = SearchEngine.binarySearch(products, searchId);
        if (result2 != null) System.out.println("Found: " + result2);
        else System.out.println("Product not found.");
    }
}
