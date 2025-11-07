package experiment_1;

public class Bayaran {
    public int hitungBayaran(Pegawai p) {
        int uang = p.getGaji();
        if (p instanceof Manager) {
            uang += ((Manager) p).getTunjangan();
        } else if (p instanceof Programmer) {
            uang += ((Programmer) p).getBonus();
        }
        return uang;
    }
}
