package effectivejava.chapter4.item24;

public class OuterClass {

    private final byte[] hugeFile;

    public OuterClass(byte[] hugeFile) {
        this.hugeFile = hugeFile;
    }

    class Inner {

    }

    public Inner getInnerClass() {
        return new Inner();
    }
}
