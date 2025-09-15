public class Processor {
    private String Merk;
    private double Frekuensi;

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String mrk) {
        Merk = mrk;
    }

    public double getFrekuensi() {
        return Frekuensi;
    }

    public void setFrekuensi(double frek) {
        Frekuensi = frek;
    }

    public void tampilkanInfo() {
        System.out.println("Merk processor : "+Merk);
        System.out.println("Frekuensi processor : "+Frekuensi + " GHz");
    }
}
