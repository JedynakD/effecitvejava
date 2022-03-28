package effectivejava.chapter2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 9;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public Object popAndNullOut() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int number : List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)) {
            stack.push(number);
        }

        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);

        stack.popAndNullOut();
        System.out.println(stack);

//      Stack{elements=[1, 2, 3, 4, 5, 6, 7, 8, 9], size=9}
//      Stack{elements=[1, 2, 3, 4, 5, 6, 7, 8, 9], size=7}
//      Stack{elements=[1, 2, 3, 4, 5, 6, null, 8, 9], size=6}
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}