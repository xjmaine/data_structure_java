import java.util.TreeSet;

public class IntegerSet {
    private TreeSet<Integer> set;

    public IntegerSet() {
        set = new TreeSet<>();
    }

    public void insert(int value) {
        set.add(value);
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public void remove(int value) {
        set.remove(value);
    }

    public int min() {
        return set.first();
    }

    public int max() {
        return set.last();
    }

    public static void main(String[] args) {
        IntegerSet set = new IntegerSet();

        set.insert(10);
        set.insert(5);
        set.insert(15);
        set.insert(3);
        set.insert(7);

        System.out.println(set.contains(5)); // prints true
        System.out.println(set.contains(4)); // prints false

        set.remove(5);
        System.out.println(set.contains(5)); // prints false

        System.out.println(set.min()); // prints 3
        System.out.println(set.max()); // prints 15
    }

}
