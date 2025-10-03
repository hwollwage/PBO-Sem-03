package Contoh2;

public class TestKomputer {
    public static void main(String[] args) {
        Desktop desk = new Desktop("Dell", 2048, 3500, "Canon");
        Laptop lap = new Laptop("Asus", 4096, 2500, 720);

        desk.showInfo();
        lap.showInfo();

        desk.nyalakanKomputer();
    }
}
