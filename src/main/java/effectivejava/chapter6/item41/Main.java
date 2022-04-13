package effectivejava.chapter6.item41;

public class Main {
    public static void main(String[] args) {
        printEnums(DesktopBrowser.class);
        printEnums(MobileBrowser.class);
    }

    private static <T extends Enum<T> & Browser> void printEnums(Class<T> opEnumType) {
        for (Browser browser : opEnumType.getEnumConstants()) {
            System.out.println(browser.getName());
        }
    }
}

