public class Engine {
    private double fuelCapacity;
    private String fuelType;

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public void tampilkanInfo() {
        System.out.println("Fuel Capacity : "+fuelCapacity);
        System.out.println("Fuel Type : "+fuelType);
    }
}
