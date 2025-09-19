package Percobaan3;
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    void setNama(String nama) {this.nama = nama;}
    void setKelas(String kelas) {this.kelas = kelas;}
    void setMasinis(Pegawai masinis) {this.masinis = masinis;}
    void setAsisten(Pegawai asisten) {this.asisten = asisten;}

    String getNama() {return nama;}
    String getKelas() {return kelas;}
    Pegawai getMasinis() {return masinis;}
    Pegawai getAsisten() {return asisten;}

    public String info() {
        String info = "";
        info += "Nama Kereta : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        info += "Masinis : " + this.masinis.info() + "\n";
        //info += "Asisten : " + this.asisten.info() + "\n";

        if(this.asisten != null) {
            info += "Asisten : " + this.asisten.info() + "\n";
        }else {
            info += "Asisten : -";
        }

        return info;
    }
}
