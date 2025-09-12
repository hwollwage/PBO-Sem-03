public class Shirt extends Clothing {
    String sleeveType;
    String material;

    Shirt(String brand, String size, String sleeveType, String material) {
        super(brand, size); //call 2 attributes from Clothing class (parent class)
        this.sleeveType = sleeveType;
        this.material = material;
    }

    void wash() {
        System.out.println("shirt being washed");
    }

    void iron() {
        System.out.println("shirt being ironed");
    }

    @Override
    void displayInfo() {
        System.out.println("- brand : "+brand);
        System.out.println("- size : "+size);
        System.out.println("- sleeve type : "+sleeveType);
        System.out.println("- material : "+material);
    }
}


