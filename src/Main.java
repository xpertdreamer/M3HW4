import customtreemap.CustomTreeMap;
import customtreeset.CustomTreeSet;

public class Main {
    public static void main(String[] args) {
        CustomTreeSet<Integer> set = new CustomTreeSet<>(new CustomTreeMap<Integer, Object>());
        set.add(4);
        set.add(5);
        set.add(8);
        set.add(1);
        System.out.println(set.contains(3));
        System.out.println(set.contains(5));
        set.remove(5);
        System.out.println(set.contains(5));
    }
}