package effectivejava.chapter7.item42;

import java.util.function.Consumer;

public class LambdaClass {

    private final byte[] hugeFile;

    private final String externalInstanceToLambda = "aaa";

    public LambdaClass(byte[] hugeFile) {
        this.hugeFile = hugeFile;
    }

    //Stateless — having no reference to the enclosing scope, stored as static variable, so it is NOT a target of GC
    public Consumer<String> getStatelessLambda() {
        return x -> x.substring(1,2);
    }

    //Stateful — contains copy of hugeFile and externalInstanceToLambda
    public Consumer<String> getStatefulLambda() {
        return str -> externalInstanceToLambda.substring(1,2);
    }
}
