package interfacelatihan;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public Sarjana(String nama) {
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("aku sudah menyelesaikan skripsi");
    }
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    //add methods from IBerprestasi interface
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("saya telah menjuarai kompetisi NASIONAL");   
    }
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya menerbitkan artikel di jurnal NASIONAL");
    }
}