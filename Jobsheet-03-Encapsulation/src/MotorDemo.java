public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.printStatus();
        motor1.tambahKecepatan();

        motor1.nyalakanMesin();
        motor1.printStatus();

        motor1.tambahKecepatan();
        motor1.printStatus();

        motor1.tambahKecepatan();
        motor1.printStatus();

        motor1.tambahKecepatan();
        motor1.printStatus();

        motor1.matikanMesin();
        motor1.printStatus();
    }
}
