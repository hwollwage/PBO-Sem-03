public class Phone {
    String brand;
    double batteryCap;

    Phone(String brand, double batteryCap) {
        this.brand = brand;
        this.batteryCap = batteryCap;
    }

    void call() {
        System.out.println("calling with phone");
    }

    void sendMessage() {
        System.out.println("sending messages");
    }

    void playGame() {
        System.out.println("playing game with phone");
    }

    void displayInfo() {
        System.out.println("- brand : "+brand);
        System.out.println("- battery capacity : "+batteryCap);
    }  
}


