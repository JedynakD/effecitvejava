package effectivejava.chapter6.item41;

public enum DesktopBrowser implements Browser {

    FIREFOX("Firefox"),
    OPERA("Opera"),
    CHROME("Chrome");

    private final String name;

    DesktopBrowser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
