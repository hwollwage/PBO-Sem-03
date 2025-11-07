package experiment_1;

public class TestBayaran {
    public static void main(String[] args) {
        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);

        Bayaran bayar = new Bayaran();
        System.out.println("Bayaran untuk Manajer : " + bayar.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer : " + bayar.hitungBayaran(prog));
    }
}
