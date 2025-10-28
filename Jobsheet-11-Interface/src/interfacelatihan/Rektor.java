package interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("selamat! silahkan perkenalkan diri anda");

        if (mahasiswa instanceof Mahasiswa) {
            ((Mahasiswa) mahasiswa).kuliahDiKampus();
        }

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("selamat! bagaimana anda berprestasi");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------");
    }
}
