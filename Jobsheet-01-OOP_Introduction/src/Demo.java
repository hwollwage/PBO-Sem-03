public class Demo {

    public static void main(String[] args) {
        //clothing
        Clothing cloth = new Clothing("adidas", "XL");
        System.out.println();
        
        cloth.wear();
        cloth.fold();
        cloth.displayInfo();
        
        System.out.println();

        //shirt
        Shirt shirt1 = new Shirt("nike", "L", "short", "polyester");
        shirt1.iron();
        shirt1.wash();
        shirt1.displayInfo(); //override
        shirt1.fold(); //inherit method from Clothing class (parent class)
        
        System.out.println();

        //pants
        Pants pants1 = new Pants("levi's", "L", "Long", "black");
        pants1.fold();
        pants1.iron();
        pants1.displayInfo(); //override
        pants1.wear(); //inherit from Clothing class (parent class)
        
        System.out.println();

        //computer
        Computer comp1 = new Computer("AMD Ryzen 5700X", "RX 7600");
        comp1.powerOn();
        comp1.powerOff();
        comp1.runProgram();
        comp1.displayInfo();

        System.out.println();

        //phone
        Phone phone1 = new Phone("Xiaomi", 5500);
        phone1.call();
        phone1.sendMessage();
        phone1.playGame();
        phone1.displayInfo();
    }
}



