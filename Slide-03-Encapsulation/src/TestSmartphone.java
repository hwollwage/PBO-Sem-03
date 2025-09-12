public class TestSmartphone {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Xiaomi Note 14");

        System.out.println("Model: " + phone.getModel());
        System.out.println("Battery: " + phone.getBatteryLevel() + "%");

        phone.useBattery(30);
        phone.charge(20);
        phone.useBattery(100);
    }
}
