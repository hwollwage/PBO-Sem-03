package Percobaan4;

public class MainPrak4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Penumpang budi = new Penumpang("324324", "pak budi");
        Gerbong gerbong = new Gerbong("A", 10);

        gerbong.setPenumpang(p, 1); 
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
