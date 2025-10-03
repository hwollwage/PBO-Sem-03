package Percobaan3;

public class Tabung extends Bangun {
    protected int t;

    public void setSuperPi(double pi) {
        super.pi = pi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        System.out.println("volume tabung adalah : "
        +(super.pi*super.r*super.r*this.t));
    }
}
