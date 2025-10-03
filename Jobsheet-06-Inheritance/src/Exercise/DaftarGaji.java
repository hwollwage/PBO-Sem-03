package Exercise;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int capacity) {
        listPegawai = new Pegawai[capacity];
        count = 0;
    }

    public void addPegawai(Pegawai p) {
        if(count < listPegawai.length) {
            listPegawai[count] = p;
            count++;
        }else {
            System.out.println("daftar gaji sudah penuh");
        }
    }

    public void printSemuaGaji() {
        for(Pegawai p : listPegawai) {
            if (p != null) {
                System.out.println("================");
                System.out.println("nama : "+p.getNama());
                System.out.printf("gaji : Rp%,d\n", p.getGaji());
                System.out.println("================");
                System.out.println();
            }
        }
    }
}
