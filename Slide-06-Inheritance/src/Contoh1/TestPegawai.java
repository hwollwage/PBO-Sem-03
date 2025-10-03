package Contoh1;

public class TestPegawai {
    public static void main(String[] args) {
        Manajer man = new Manajer();

        man.nama = "Bob";
        man.gaji = 9999999;
        man.departemen = "IT";

        System.out.println("Nama : "+man.nama);
        System.out.println("Gaji : "+man.gaji);
        System.out.println("Departemen : "+man.departemen);
    }
}
