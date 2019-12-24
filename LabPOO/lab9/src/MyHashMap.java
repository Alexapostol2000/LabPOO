import java.util.ArrayList;

public class MyHashMap<K, V> {
    private int capacity;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Entry> getEntry() {
        return entry;
    }

    private ArrayList<Entry> entry = new ArrayList<>( );

    public void put(K key, V value) {
        int ok = 0;
        for (Entry el : entry) {
            if (el.getKey().equals(key)) {
                el.setValue(value);
                ok = 1;
                break;
            }
        }
        if (ok == 0) {
            Entry el = new Entry(key, value);
            entry.add(el);
        }
    }

    public V get(K key) {
        for (Entry el : entry) {
            if (el.getKey().equals(key)) {
                return el.value;
            }
        }
        return null;
    }

    class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
