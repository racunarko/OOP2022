package hr.fer.oop.zad3;

public class Printer {
    public static String printVideoList(MyList<Video> video) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < video.size(); i++) {
            Video sample = video.elementAt(i);
            sb.append(sample.getTitle());
            sb.append(" - ");
            sb.append(sample.getLength());
            sb.append(" sec. - ");
            sb.append(sample.getFormat());
            sb.append("\n");
        }
        return sb.toString();
    }
    public static <T extends Audio> String printAudioList(MyList<T> audio) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < audio.size(); i++) {
            T sample = audio.elementAt(i);
            sb.append(sample.getTitle());
            sb.append(" - ");
            sb.append(sample.getLength());
            sb.append(" sec. - ");
            sb.append(sample.getCodec());
            sb.append("\n");
        }
        return sb.toString();
    }
}
