package effectivejava.chapter5.item33;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        TypesafeHeterogeneousContainer container = new TypesafeHeterogeneousContainer();
        container.putItem(String.class, "String");
        container.putItem(Long.class, 100000L);
        container.putItem(Locale.class, Locale.ENGLISH);

        //container.putItem(Character.class, 10); compiler error

        System.out.println(container.getItem(String.class));
        System.out.println(container.getItem(Long.class));
        System.out.println(container.getItem(Locale.class));
        System.out.println(container.getItem(Character.class));

        //String
        //100000
        //en
        //null
    }
}
