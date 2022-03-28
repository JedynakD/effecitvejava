package effectivejava.chapter2.item5.example2;


public class Widget {

    private final Painter painter;

    public Widget(Painter painter) {
        this.painter = painter;
    }

    public void create() {
        painter.paint();
    }
}

class Painter {
    public void paint() {
        System.out.println("Painting...");
    }
}
