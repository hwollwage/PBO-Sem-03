public class Building implements DestroyAble {
    @Override
    public void destroyed() {
        System.out.print("Building has been destroyed!");
    }
}