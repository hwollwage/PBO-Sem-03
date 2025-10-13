package Overloading_Example;

public class TestGasStation {
    public static void main(String[] args) {
        MobilMewah alphard = new MobilMewah();
        MobilKuno carry = new MobilKuno();
        GasStation gs = new GasStation();

        gs.isiBahanBakar(carry);
        gs.isiBahanBakar(alphard);
    }
}
