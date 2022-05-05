package hr.fer.oop.zad3;

public class MediaPrinter<E extends Media> extends PrintableList<E> {

    public MediaPrinter() {
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < super.size(); i++) {
            E sample = super.elementAt(i);
            sb.append(sample.getTitle());
            sb.append(" is ");
            sb.append(sample.getLength());
            sb.append(" seconds long.\n");
        }
        return sb.toString();
    }
}
