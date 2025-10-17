public class Main {
    public static void main(String[] args) {
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot("PATROL ASIMO", 2048, 150, new Battery(16000));

        pr.increasePower();

        System.out.println("name : " + pr.getName());
        System.out.println("cpu speed : " + pr.getCpuSpeed());
        System.out.println("power : " + pr.getPower());

        System.out.println("battery capacity : " + pr.getBattery().getCapacity());
    }
}
