public class Character {
    String name;

    public Character(String name) {
        this.name = name;
    }

    public void destroy(DestroyAble da) {
        da.destroyed();
        //System.out.println();
        System.out.println(" By " + this.name + ".");
    }
}