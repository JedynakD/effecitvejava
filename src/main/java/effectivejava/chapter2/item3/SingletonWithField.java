package effectivejava.chapter2.item3;

import java.io.Serializable;

public class SingletonWithField implements Serializable {

    private transient String instanceField = "0001";

    public final SingletonWithField INSTANCE = new SingletonWithField();

    private SingletonWithField() {
    }

    public void process() {
        System.out.println("Processing...");
    }

    // do not create new object when deserializing but use always INSTANCE
    private Object readResolve() {
        return INSTANCE;
    }
}
