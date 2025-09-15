public class TestMotorcycle {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setFuelCapacity(5);
        engine.setFuelType("Pertalite");

        Motorcycle mtr = new Motorcycle("Vario", "White", 100, engine);
        mtr.tampilkanInfo();
        mtr.increaseSpeed(); //each gain 40
        mtr.increaseSpeed();
        mtr.increaseSpeed();
    }
}
