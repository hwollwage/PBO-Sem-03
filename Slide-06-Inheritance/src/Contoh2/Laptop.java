package Contoh2;

public class Laptop extends Komputer {
    protected int resolusiLayar;

    public Laptop(String merk, int memory, int cpu, int resolusiLayar) {
        super(merk, memory, cpu);
        this.resolusiLayar = resolusiLayar;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Resolusi Layar : "+resolusiLayar);
    }
}
