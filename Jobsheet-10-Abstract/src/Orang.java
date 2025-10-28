public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama) {
        this.nama = nama;
    }
    public void peliharaanHewan(Hewan hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan() {
        System.out.println("namaku : "+this.nama);
        System.out.println("hewan peliharaanku berjalan dengan cara");
        this.hewanPeliharaan.bergerak();
        System.out.println("==========================================");
    }
}
