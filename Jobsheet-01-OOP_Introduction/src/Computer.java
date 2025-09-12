public class Computer {
    String cpu;
    String gpu;
    
    Computer(String cpu, String gpu) {
        this.cpu = cpu;
        this.gpu = gpu;
    }

    void powerOn() {
        System.out.println("computer turned on");
    }

    void powerOff() {
        System.out.println("computer turned off");
    }

    void runProgram() {
        System.out.println("computer running proram");
    }

    //not overrride (no inheritance from any class)
    void displayInfo() {
        System.out.println("- cpu : "+cpu);
        System.out.println("- gpu : "+gpu);
    }
 }


 