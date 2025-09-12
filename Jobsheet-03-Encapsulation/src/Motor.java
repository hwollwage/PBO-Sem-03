public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn) {
            if (kecepatan < 100) {
                kecepatan += 60;
                if (kecepatan > 100) {
                    kecepatan = 100; // limit the speed at 100
                }
            } else {
                System.out.println("speed maximum 100\n");
            }
        } else {
            System.out.println("kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("kontak on");
        } else {
            System.out.println("kontak off");
        }
        System.out.println("kecepatan " + kecepatan + "\n");
    }
}
