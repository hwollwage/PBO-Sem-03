public class Senjata {
    private String nama;
    private int kekuatan;

    public Senjata(String nam, int kek) {
        nama = nam;
        kekuatan = kek;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nm) {
        nama = nm;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int k) {
        kekuatan = k;
    }
}
