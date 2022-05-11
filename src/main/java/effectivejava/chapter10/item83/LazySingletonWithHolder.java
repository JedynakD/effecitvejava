package effectivejava.chapter10.item83;

public class LazySingletonWithHolder {

    //lazy initialize with hidden synchronization by JVM
    private static class Holder {
        private static final LazySingletonWithHolder INSTANCE = new LazySingletonWithHolder();
    }

    public static LazySingletonWithHolder getInstance() {
        return Holder.INSTANCE;
    }

    // runs only when getInstance() is invoked
    private LazySingletonWithHolder() {
        System.out.println("init...");
    }

    public static void main(String[] args) {
        System.out.println("start");
        LazySingletonWithHolder.getInstance();
        System.out.println("end");
//        start
//        init...
//        end
    }
}
