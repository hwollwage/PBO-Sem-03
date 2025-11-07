package experiment_2;

public class Human {
    public void turnOnDevice(Electronics device) {
        if (device instanceof ClassicTelevision) {
            ClassicTelevision tv = (ClassicTelevision) device;
            System.out.println("Nyalakan televisi jadul dengan input: " + tv.getInputMode());
        } else if (device instanceof ModernTelevision) {
            ModernTelevision tv = (ModernTelevision) device;
            System.out.println("Nyalakan televisi modern dengan input: " + tv.getInputMode());
        }
        System.out.println("Tegangan televisi: " + device.getVoltage());
    }
}
