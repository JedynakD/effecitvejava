package effectivejava.chapter4.item24;

public class OuterClass {

    private final byte[] hugeFile;

    public OuterClass(byte[] hugeFile) {
        this.hugeFile = hugeFile;
    }

    //static -> just adding "static" will prevent the memory leak, GC will work just fine
    class Inner {

    }

    public Inner getInnerClass() {
        return new Inner();
    }
}
