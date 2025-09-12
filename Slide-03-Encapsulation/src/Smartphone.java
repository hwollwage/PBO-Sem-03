public class Smartphone {
    private String model;
    private int batteryLevel;

    public Smartphone(String model) {
        this.model = model;
        this.batteryLevel = 100; 
    }
    public String getModel() {
        return model;
    }
    public int getBatteryLevel() {
        return batteryLevel;
    }
    public void charge(int amount) {
        if (amount > 0) {
            batteryLevel += amount;
            if (batteryLevel > 100) {
                batteryLevel = 100;
            }
            System.out.println("Phone charged. Battery: " + batteryLevel + "%");
        }
    }
    public void useBattery(int amount) {
        if (amount > 0 && batteryLevel >= amount) {
            batteryLevel -= amount;
            System.out.println("Phone used. Battery left: " + batteryLevel + "%");
        } else {
            System.out.println("Not enough battery!");
        }
    }
}

