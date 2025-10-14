package Overloading_Tasks;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        return sisiC;
    }

    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        
        System.out.println("total 1 sudut : " + sgt.totalSudut(90));
        System.out.println("total 2 sudut : " + sgt.totalSudut(30, 40));
        System.out.println("keliling 3 sisi : " + sgt.keliling(3, 4, 5));
        System.out.println("keliling 2 sisi : " + sgt.keliling(3, 4));

    }
}
