package hr.fer.oop.samostalneVjezbe.vjezba03.zad06;

class SingleTypeKeyValue<T> extends KeyValue<T, T> {
    public SingleTypeKeyValue(T key, T value) {
        super(key, value);
    }
}
