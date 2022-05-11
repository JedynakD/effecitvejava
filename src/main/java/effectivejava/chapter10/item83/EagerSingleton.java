package effectivejava.chapter10.item83;

public class EagerSingleton {

    // initialized before main is run -> eagerly
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    // runs before getInstance() is invoked
    private EagerSingleton() {
        System.out.println("init...");
    }

    public static void main(String[] args) {
        System.out.println("start");
        EagerSingleton.getInstance();
        System.out.println("end");
//        init...
//        start
//        end
    }

}
