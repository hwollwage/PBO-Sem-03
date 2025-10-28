package interfacelatihan;
//we also need to implements cumlaude interface
public class Mahasiswa implements ICumlaude {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    public void kuliahDiKampus() {
        System.out.println("aku mahasiswa, namaku : "+this.nama);
        System.out.println("aku berkuliah di kampus");
    }
    //add this from Cumlaude interface
    @Override
    public void lulus() {
        System.out.println("aku lulus sebagai mahasiswa biasa");
    }
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku cukup tapi tidak cumlaude");
    }
}