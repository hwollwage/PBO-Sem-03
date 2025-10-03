package Contoh2;

public class Desktop extends Komputer {
    protected String printer;

    public Desktop(String merk, int memory, int cpu, String printer) {
        super(merk, memory, cpu);
        this.printer = printer;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Printer : "+printer);
    }
}
