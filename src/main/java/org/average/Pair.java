package org.average;

public class Pair<T, V> {
    private T key;
    private V value;

    public Pair() {
    }

    public Pair(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "<" + key + "," + value + ">";
    }
}
