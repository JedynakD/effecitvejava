package effectivejava.chapter3.item14;

public class Main {
    public static void main(String[] args) {
        IntegerWrapper integer1 = new IntegerWrapper(-2000000000);
        IntegerWrapper integer2 = new IntegerWrapper(2000000000);

        System.out.println(integer1.compareTo(integer2));
        //-1

        System.out.println(integer1.brokenCompareTo(integer2));
        //int overflow
        //294967296
    }
}
