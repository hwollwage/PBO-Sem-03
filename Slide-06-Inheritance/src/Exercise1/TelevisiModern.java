package Exercise1;

public class TelevisiModern extends Televisi {
    private String modusTampilan;
    private String dvd;

    public TelevisiModern(String merk, int jumlahChannel) {
        super(merk, jumlahChannel);
        this.modusTampilan = "kosong";
        this.dvd = "kosong";
    }

    public void gantiModusTampilan(String modusTampilan) {
        this.modusTampilan = modusTampilan;
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }

    public void masukkanDVD(String dvd) {
        this.dvd = dvd;
    }
}
