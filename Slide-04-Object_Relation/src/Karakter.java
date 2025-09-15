public class Karakter {
    private String nama;
    private Senjata SenjataTerpasang[];

    public String getNama() {
        return nama;
    }

    public void setNama(String nam) {
        nama = nam;
    }

    public Senjata[] getSenjataTerpasang() {
        return SenjataTerpasang;
    }

    public void setSenjataTerpasang(Senjata[] sjt) {
        SenjataTerpasang = sjt;
    }

    public void tampilkanInfo() {
        System.out.println("\nNama karakter : "+nama);
        for(int i = 0; i < SenjataTerpasang.length; i++) {
            System.out.println("Senjata "+ i + " : "+ SenjataTerpasang[i].getNama());
        }
    }
}
