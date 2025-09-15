public class Motorcycle {
    private String brand;
    private String color;
    private Engine engine;
    private int maxSpeed;
    private int speed = 0;

    public Motorcycle(String brand, String color, int maxSpeed, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public void increaseSpeed() {
        speed += 40;
        if (speed >= maxSpeed) {
            speed = maxSpeed;
            System.out.println("motorcycle can't go faster, it already hit max speed");
        } else {
            System.out.println("motorcycle speed is now "+speed);
        }
    }

    public void decreaseSpeed() {
        speed -= 40;
        if (speed <= 0) {
            speed = 0;
            System.out.println("motorcyle is now stopped");
        } else {
            System.out.println("motorcyle speed is now "+speed);
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    } 

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void tampilkanInfo() {
        System.out.println("Brand : "+brand);
        System.out.println("Color : "+color);
        System.out.println("Max Speed : "+maxSpeed);
        System.out.println("======================");
        engine.tampilkanInfo();
        System.out.println("======================");
    }
}
