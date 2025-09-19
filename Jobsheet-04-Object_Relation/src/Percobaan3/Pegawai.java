package Percobaan3;
public class Pegawai {
    private String nip;
    private String nama;

    Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    void setNip(String nip) {this.nip = nip;}
    void setNama(String nama) {this.nama = nama;}

    String getNip() {return nip;}
    String getNama() {return nama;}
    
    public String info() {
        String info = "";
        info += "Nip : "+this.nip + "\n";
        info += "Nama : "+this.nama + "\n";
        return info;
    } 
}
