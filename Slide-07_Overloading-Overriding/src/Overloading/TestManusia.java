package Overloading;

public class TestManusia {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        man.setBiodata("Hanzel");
        man.setBiodata("Hanzel", 19);
        man.setBiodata("Hanzel", 19, "Malang");
    }
}
