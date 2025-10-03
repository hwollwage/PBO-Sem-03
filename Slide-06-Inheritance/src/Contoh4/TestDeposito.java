package Contoh4;

public class TestDeposito {
    public static void main(String[] args) {
        Deposito dpt = new Deposito(1200000, 4);

        System.out.println("Saldo awal :"+dpt.saldo);
        System.out.println("Niali bunga deposito : "+dpt.getNilaiBunga());
        System.out.println("Total deposito : "+ (dpt.getSaldo() + dpt.getNilaiBunga()));
    }
}