package effectivejava.chapter6.item41;

public enum MobileBrowser implements Browser {

    DOLPHIN("Dolphin"),
    PUFFIN("Puffin"),
    FIREFOX_FOCUS("Firefox Focus");

    private final String name;

    MobileBrowser(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
