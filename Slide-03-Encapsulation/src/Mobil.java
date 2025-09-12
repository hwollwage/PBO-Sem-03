public class Mobil {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 10;            
        } else {
            System.out.println("Tidak bisa menambah kecepatan, mesin belum menyala!\n");
        }
    }
    public void kurangiKecepatan() {
        if(kontakOn == true) {
            kecepatan -= 10;
        } else {
            System.out.println("tidak bisa mengurangi kecepatan, mesin belum menyala!\n");
        }
    }
    public void tampilkanStatus() {
        if (kontakOn == true) {
            System.out.println("kontak ON");
        } else {
            System.out.println("kontak OFF");
        }
        System.out.println("Kecepatan : "+kecepatan+ " \n");
    }
}

