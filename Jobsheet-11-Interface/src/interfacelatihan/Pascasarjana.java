package interfacelatihan;

public class Pascasarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public Pascasarjana(String nama) {
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("aku sudah menyelesaikan TESIS");
    }
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
