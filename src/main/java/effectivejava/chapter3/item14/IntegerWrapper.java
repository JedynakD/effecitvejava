package effectivejava.chapter3.item14;

public class IntegerWrapper implements Comparable<IntegerWrapper> {

    private final int integer;

    public IntegerWrapper(int integer) {
        this.integer = integer;
    }

    public int brokenCompareTo(IntegerWrapper integerWrapper) {
        return integer - integerWrapper.integer;
    }

    @Override
    public int compareTo(IntegerWrapper integerWrapper) {
        return Integer.compare(this.integer, integerWrapper.integer);
    }
}
