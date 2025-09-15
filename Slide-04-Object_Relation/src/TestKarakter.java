public class TestKarakter {
    public static void main(String[] args) {
        Senjata snj1 = new Senjata("Pedang", 100);
        Senjata snj2 = new Senjata("Panah", 70);
        Senjata snj3 = new Senjata("Pisau", 30);

        Karakter kar1 = new Karakter();
        kar1.setNama("Arjuna");
        kar1.setSenjataTerpasang(new Senjata[] {snj1, snj2});
        
        Karakter kar2 = new Karakter();
        kar2.setNama("Kurawa");
        kar2.setSenjataTerpasang(new Senjata[] {snj3});
        
        kar1.tampilkanInfo();
        kar2.tampilkanInfo();
    }
}
