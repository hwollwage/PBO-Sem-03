public class Pants extends Clothing {
    String pantsType;
    String color;

    Pants(String brand, String size, String pantsType, String color) {
        super(brand, size); //call 2 attributes from Clothing class (parent class)
        this.pantsType = pantsType;
        this.color = color;
    }

    void fold() {
        System.out.println("pants being folded");
    }

    void iron() {
        System.out.println("pants being ironed");
    }

    @Override
    void displayInfo() {
        System.out.println("- brand : "+brand);
        System.out.println("- size : "+size);
        System.out.println("- pants type : "+pantsType);
        System.out.println("- color : "+color);
    }
}


