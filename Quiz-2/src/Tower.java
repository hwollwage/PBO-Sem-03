public class Tower implements DestroyAble {
    @Override
    public void destroyed() {
        System.out.print("Tower has been destroyed!");
    }
}