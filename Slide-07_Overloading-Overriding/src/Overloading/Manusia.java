package Overloading;

public class Manusia {
    public void setBiodata(String nama) {
        System.out.println("set biodata pertama");
    }

    public void setBiodata(String nama, int umur) {
        System.out.println("set biodata kedua");
    }

    public void setBiodata(String nama, int umur, String alamat) {
        System.out.println("set biodata ketiga");
    }
}