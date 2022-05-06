package hr.fer.oop.zad3;

import javax.naming.Name;

public class NameablePrinter<T extends Artwork & Nameable> extends MyList<T> implements Printable {

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < super.size(); i++) {
            T sample = super.elementAt(i);
            sb.append(sample.getAuthor());
            sb.append(": ");
            sb.append(sample.getName());
            sb.append("\n");
        }
        return sb.toString();
    }
}
