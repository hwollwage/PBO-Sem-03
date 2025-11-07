package assignment;

public class Plant {
    public void doDestroy(Destroyable d) {
        if (d instanceof Zombie) {
            Zombie z = (Zombie) d;
            z.destroyed();
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}
