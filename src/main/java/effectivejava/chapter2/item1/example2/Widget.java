package effectivejava.chapter2.item1.example2;

public class Widget {
    private static final Widget blue = new Widget("blue");
    private static final Widget red = new Widget("red");

    private final String color;

    private Widget(String color) {
        this.color = color;
    }

    public static Widget blue() {
        return blue;
    }

    public static Widget red() {
        return red;
    }

    @Override
    public String toString() {
        return color;
    }
}
