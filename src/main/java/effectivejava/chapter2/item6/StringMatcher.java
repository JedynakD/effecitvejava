package effectivejava.chapter2.item6;

import java.util.regex.Pattern;

public class StringMatcher {
    private static final Pattern PATTERN = Pattern.compile("^(?=.)D*(D[A]|D?C{0,10})");

    static boolean matches(String s) {
        return PATTERN.matcher(s).matches();
    }
}