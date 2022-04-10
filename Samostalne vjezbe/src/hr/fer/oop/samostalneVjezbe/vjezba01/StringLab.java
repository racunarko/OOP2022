package hr.fer.oop.samostalneVjezbe.vjezba01;

class StringLab {
    public static void main(String[] args) {
        String[] txt = new String[]{"ABC", "", "D", "EF"};
        System.out.println(stringFloss(txt));
    }

    public static String stringFloss(String[] elements) {
        StringBuilder sb = new StringBuilder();
        if (elements.length != 0) {
            int maxLength = elements[0].length();
            for (int i = 1; i < elements.length; i++) {
                if (maxLength < elements[i].length()) {
                    maxLength = elements[i].length();
                }
            }
            for (int i = 0; i < maxLength; i++) {
                for (int j = 0; j < elements.length; j++) {
                    if(!elements[j].equals("") && (i < elements[j].length())) {
                        char c = elements[j].charAt(i);
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}