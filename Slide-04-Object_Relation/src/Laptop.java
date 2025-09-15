public class Laptop {
    private String Merk;
    private Processor CPU;

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String mrk) {
        Merk = mrk;
    }

    public Processor getCPU() {
        return CPU;
    }

    public void setCPU(Processor proc) {
        CPU = proc;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Laptop : "+Merk);
        CPU.tampilkanInfo();
    }
}
