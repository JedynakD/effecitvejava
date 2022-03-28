package effectivejava.chapter2.item3;

// best way to implement singleton
public enum SingletonEnum {

    INSTANCE;

    public void process() {
        System.out.println("Processing...");
    }
}
