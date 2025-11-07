package experiment_2;

public class TestElektronik {
    public static void main(String[] args) {
        Human indro = new Human();
        ClassicTelevision tvJadul = new ClassicTelevision();
        ModernTelevision tvModern = new ModernTelevision();

        indro.turnOnDevice(tvJadul);
        indro.turnOnDevice(tvModern);
    }
}
