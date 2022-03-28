package effectivejava.chapter2.item5.example1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println(ListCreator.createList(ArrayList::new));
        System.out.println(ListCreator.createList(LinkedList::new));
        System.out.println(ListCreator.createList(Vector::new));
    }
}
