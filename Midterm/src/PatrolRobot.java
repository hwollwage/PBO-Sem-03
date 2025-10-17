public class PatrolRobot extends Robot {
    private Battery battery;

    public PatrolRobot(String name, int cpuSpeed, int power, Battery battery) {
        super(name, cpuSpeed, power);
        this.battery = battery;
    }

    @Override
    public void increasePower() {
        setPower(getPower() + 20);
    }

    public Battery getBattery() {return battery;}
    public void setBattery(Battery battery) {this.battery = battery;}
}
