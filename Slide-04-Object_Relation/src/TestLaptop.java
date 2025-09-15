public class TestLaptop {

    public static void main(String[] args) {
        Processor proc = new Processor();
        proc.setMerk("Intel Core i7");
        proc.setFrekuensi(2400);

        Laptop lap = new Laptop();
        lap.setMerk("Asus");
        lap.setCPU(proc);

        lap.tampilkanInfo();
        System.out.println("=========");

        System.out.println("Merek Laptop : "+lap.getMerk());
        System.out.println("dengan processor : "+lap.getCPU().getMerk());
    }
}
