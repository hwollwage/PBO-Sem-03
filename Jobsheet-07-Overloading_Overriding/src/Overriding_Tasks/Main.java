package Overriding_Tasks;

public class Main {
    public static void main(String[] args) {
        Manusia manusia1;

        manusia1 = new Dosen();
        manusia1.makan();
        ((Dosen)manusia1).lembur();

        System.out.println("================");

        manusia1 = new Mahasiswa();
        manusia1.makan();
        ((Mahasiswa)manusia1).tidur();
    }
}
