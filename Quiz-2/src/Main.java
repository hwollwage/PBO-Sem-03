public class Main {
    public static void main(String[] args) {
        Monster mon = new Monster("T-Rex", 100);
        Robot rbt = new Robot("Macross", 90);

        mon.destroy(new Building());
        mon.destroy(new Tower());
        rbt.destroy(new Tower());
    }
}