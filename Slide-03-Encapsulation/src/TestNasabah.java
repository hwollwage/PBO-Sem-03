public class TestNasabah {
    public static void main(String[] args) {
        Nasabah anton = new Nasabah(null, null, 0);

        anton.setNomorRekening("123123");
        anton.setNama("Anton Kemang");
        anton.setor(10000);

        System.out.println("Saldo : "+anton.getNama() + " saat ini : Rp "+ anton.getSaldo());
        anton.tarik(5000);
        System.out.println("Saldo : "+anton.getNama() + " saat ini : Rp "+ anton.getSaldo());

        System.out.println();

        Nasabah nas = new Nasabah("1156677", "Nikiloe Tesla", 900000);

        System.out.println("Nomor rekening : " + nas.getNomorRekening());
        System.out.println("Nama : "+ nas.getNama());
        System.out.println("Saldo : " + nas.getSaldo());
    }
}
