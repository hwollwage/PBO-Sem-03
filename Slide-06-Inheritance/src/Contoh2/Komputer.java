package Contoh2;

public class Komputer {
    protected String merk;
    protected int kapasitasMemory;
    protected int kecepatanCPU;

    public Komputer(String merk, int kapasitasMemory,int kecepatanCPU) {
        this.merk = merk;
        this.kapasitasMemory = kapasitasMemory;
        this.kecepatanCPU = kecepatanCPU;
    }

    public void showInfo() {
        System.out.println("\nMerk : "+merk);
        System.out.println("Kapasitas Memory : "+kapasitasMemory);
        System.out.println("Kecepatan CPU : "+kecepatanCPU);
    }

    public void nyalakanKomputer() {
        System.out.println("\nKomputer "+merk+" dinyalakan");
    }
}
