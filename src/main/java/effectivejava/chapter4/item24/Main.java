package effectivejava.chapter4.item24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true) {
            //OutOfMemoryError , GC not happening until the inner object is garbage collected
            list.add(new OuterClass(new byte[100000]).getInnerClass());
        }
    }
}
