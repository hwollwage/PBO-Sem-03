package Exercise;

class Ikan {
    public void swim() {
        System.out.println("ikan bisa berenang");
    }
}

class Piranha extends Ikan {
    public void swim() {
        System.out.println("piranha bisa makan daging");
    }
}

public class Fish {
    public static void main(String[] args) {
        Ikan a = new Ikan();
        Ikan b = new Piranha();
        a.swim();
        b.swim();
    }
}
