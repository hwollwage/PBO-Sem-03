package Contoh4;

public class Deposito extends Rekening {
    private double bungaPerBulan;
    private int tenor;

    public Deposito(int saldoAwal, int masaTenor) {
        saldo = saldoAwal;
        tenor = masaTenor;
        bungaPerBulan = 0.05;
    }

    public double getNilaiBunga() {
        double nilaiBunga;
        nilaiBunga = saldo * bungaPerBulan * tenor / 12;
        return nilaiBunga;
    }
}
