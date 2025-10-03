package Contoh4;

public class Rekening {
    protected int saldo;

    public int getSaldo() {return saldo;}

    public void simpanUang(int jumlah) {
        saldo = saldo + jumlah;
    }

    public void ambilUang(int jumlah) {
        saldo = saldo - jumlah;
    }
}
