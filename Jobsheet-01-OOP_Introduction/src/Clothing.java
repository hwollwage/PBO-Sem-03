public class Clothing {
    String brand;
    String size;

    Clothing(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    void wear() {
        System.out.println("wearing clothes");
    }

    void fold() {
        System.out.println("folding clothes");
    }

    void displayInfo() {
        System.out.println("- brand : "+brand);
        System.out.println("- size : "+size);
    }
}

