package hr.fer.oop.homework_08.e07;

import hr.fer.oop.homework_08.e01e03.KeyValueMapEntry;

public class CountableKeyValueMapEntry<V> extends KeyValueMapEntry<Integer, V> {
    private int id;
    private static int count;

    public CountableKeyValueMapEntry(Integer key, V value) {
        super(key, value);
        id = ++count;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", id: " + id;
    }
}
