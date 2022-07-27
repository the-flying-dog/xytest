package design;

public class StaticSingleton {
    private StaticSingleton(){};
    public static final StaticSingleton getInstance() {
        return Holder.singleton;
    }
    private static class Holder {
        private static final StaticSingleton singleton = new StaticSingleton();
    }
}
