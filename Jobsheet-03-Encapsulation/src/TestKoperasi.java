import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnggotaKoperasi donny = new AnggotaKoperasi("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        while (true) {
            System.out.println("\nKoperasi Hanzel 15");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                System.out.print("Masukkan nominal pinjaman: ");
                int uang = sc.nextInt();
                donny.pinjam(uang);
            } else if (pilihan == 2) {
                System.out.print("Masukkan nominal angsuran: ");
                int uang = sc.nextInt();
                donny.angsur(uang);
            } else {
                break;
            }
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        }

        sc.close();


        /* PRE-MODIFIED CODE
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());*/
    }
}
