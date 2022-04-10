package hr.fer.oop.samostalneVjezbe.vjezba02.zad02;

public interface Hasher {
    public byte[] hash(byte[] prevHash, String[] transactions);
}
