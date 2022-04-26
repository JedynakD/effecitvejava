package effectivejava.chapter7.item42;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        while (true) {
            //OutOfMemoryError , lambda contains copies of LambdaClass internals
            list.add(new LambdaClass(new byte[10000]).getStatefulLambda());
        }

//        while (true) {
//            //no OutOfMemoryError
//            list.add(new LambdaClass(new byte[10000]).getStatelessLambda());
//        }
    }
}
