package Overriding_Tasks;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("dosen sedang makan");
    }

    public void lembur() {
        System.out.println("dosen sedang lembur");
    }
}
