package effectivejava.chapter2.item5.example1;

import java.util.List;
import java.util.function.Supplier;

public class ListCreator<T> {

    public static <T> List<T> createList(final Supplier<? extends List<T>> listFactory) {
        return listFactory.get();
    }
}
