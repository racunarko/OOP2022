package hr.fer.oop.zad3;

public class PaintingPrinter extends MyList<Painting> implements Printable {

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < super.size(); i++) {
            Painting sample = super.elementAt(i);
            sb.append(sample.getAuthor());
            sb.append(": ");
            sb.append(sample.getName());
            sb.append(" painted by using ");
            sb.append(sample.getTechnique());
            sb.append("\n");
        }
        return sb.toString();
    }
}
