package interfacelatihan;

public class MultipleInterfaceMain {
    public static void main(String[] args) {

        Rektor pakRektor = new Rektor();
        Sarjana sarjanaCum = new Sarjana("Dini");
        Pascasarjana masterCum = new Pascasarjana("Elok");

        pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatMawapres(masterCum);
    }
}
