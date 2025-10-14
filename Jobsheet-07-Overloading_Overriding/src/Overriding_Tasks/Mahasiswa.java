package Overriding_Tasks;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("mahasiswa sedang makan");
    }

    public void tidur() {
        System.out.println("mahasiswa sedang tidur");
    }
}
