package effectivejava.chapter6.item36;

public class Benchmark {

    static long getExecutionTime(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long stop = System.currentTimeMillis();
        return stop - start;
    }

}
