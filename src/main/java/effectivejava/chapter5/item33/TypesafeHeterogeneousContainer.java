package effectivejava.chapter5.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TypesafeHeterogeneousContainer {
    private final Map<Class<?>, Object> map = new HashMap<>();

    public <T> T getItem(Class<T> type) {
        return type.cast(map.get(type));
    }

    public <T> void putItem(Class<T> type, T instance) {
        map.put(Objects.requireNonNull(type), type.cast(instance));
    }

}
