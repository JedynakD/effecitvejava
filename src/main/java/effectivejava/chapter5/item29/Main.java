package effectivejava.chapter5.item29;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        HeapPollution.produce(list, 42);
        System.out.println(list.get(0));
    }
}

class HeapPollution {
    public static void produce(List list, Object obj) {
        list.add(obj);
    }
}
