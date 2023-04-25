package customtreeset;

import customtreemap.CustomTreeMap;

public class CustomTreeSet<E> {
    private CustomTreeMap<E, Object> map;
    private final Object PRESENT = new Object();

    public CustomTreeSet(CustomTreeMap<E, Object> map) {
        this.map = map;
    }

    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    public boolean remove(E e) {
        return map.remove(e) == PRESENT;
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }
}
