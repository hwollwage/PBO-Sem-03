public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbalumba = new Ikan();

        Orang ani = new Orang("ani");
        Orang budi = new Orang("budi");

        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbalumba);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}