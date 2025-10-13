package Overriding_Example;

public class Manajer {
    protected String nama;
    protected int gaji;
    
    public Manajer(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += 1000000; 
    }

    public void cetakStatus() {
        System.out.println("nama : "+nama);
        System.out.println("gaji : "+gaji);
    }
}
