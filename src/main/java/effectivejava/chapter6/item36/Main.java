package effectivejava.chapter6.item36;

import java.time.Month;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import static effectivejava.chapter6.item36.Benchmark.getExecutionTime;

public class Main {

    public static void main(String[] args) {
        System.out.println("BitField: " + getExecutionTime(() -> {
            int bitField = Month.JANUARY.getValue() | Month.FEBRUARY.getValue() | Month.APRIL.getValue();
            for (int i = 0; i < 1000000000; i++) {
                int bitField2 = Month.JANUARY.getValue() | Month.FEBRUARY.getValue() | Month.APRIL.getValue();
                assert bitField == bitField2;
            }
        }));

        System.out.println("EnumSet: " + getExecutionTime(() -> {
            Set<Month> enumSet = EnumSet.of(Month.JANUARY, Month.FEBRUARY, Month.APRIL);
            for (int i = 0; i < 1000000000; i++) {
                Set<Month> enumSet2 = EnumSet.of(Month.JANUARY, Month.FEBRUARY, Month.APRIL);
                assert enumSet.equals(enumSet2);
            }
        }));

        System.out.println("HashSet: " + getExecutionTime(() -> {
            Set<Month> hashSet = new HashSet<>();
            hashSet.add(Month.JANUARY);
            hashSet.add(Month.FEBRUARY);
            hashSet.add(Month.APRIL);

            for (int i = 0; i < 1000000000; i++) {
                Set<Month> hashSet2 = new HashSet<>();
                hashSet2.add(Month.JANUARY);
                hashSet2.add(Month.FEBRUARY);
                hashSet2.add(Month.APRIL);
                assert hashSet.equals(hashSet2);
            }
        }));

//        BitField: 3 millis
//        EnumSet: 2698 millis
//        HashSet: 50805 millis
    }
}
