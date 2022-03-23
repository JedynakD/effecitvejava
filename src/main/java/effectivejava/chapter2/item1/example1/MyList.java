package effectivejava.chapter2.item1.example1;

public interface MyList {

    static MyList createList(int initialSize) {
        if (initialSize > 100) {
            return BigList.create();
        }
        return SmallList.create();
    }

}

class SmallList implements MyList {
    private static final SmallList instance = new SmallList();

    private int size = 100;

    private SmallList() {
    }

    public static SmallList create() {
        return instance;
    }
}

class BigList implements MyList {
    private static final BigList instance = new BigList();

    private int size = Integer.MAX_VALUE;

    private BigList() {

    }

    public static BigList create() {
        return instance;
    }

}


