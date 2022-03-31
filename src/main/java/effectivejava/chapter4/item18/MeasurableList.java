package effectivejava.chapter4.item18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class MeasurableList<E> extends ForwardingList<E> {
    private long lastAddAllOperationDuration = 0;

    public MeasurableList(List<E> list) {
        super(list);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        long start = System.currentTimeMillis();
        boolean addResult = super.addAll(collection);
        long finish = System.currentTimeMillis();

        this.lastAddAllOperationDuration = finish - start;
        return addResult;
    }

    public long getLastAddAllOperationDuration() {
        return lastAddAllOperationDuration;
    }

    public static void main(String[] args) {
        MeasurableList<String> arrayList = new MeasurableList<>(new ArrayList<>());

        MeasurableList<String> linkedList = new MeasurableList<>(new LinkedList<>());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(String.valueOf(i));
        }

        arrayList.addAll(list);
        System.out.println(arrayList.getLastAddAllOperationDuration());
        //3ms

        linkedList.addAll(list);
        System.out.println(linkedList.getLastAddAllOperationDuration());
        //84ms
    }

}
