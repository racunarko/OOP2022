package hr.fer.oop.pred02_ObjectCreation.objectcreation;

public class WorkingWithStrings {
    public static void main(String[] args) {
        //equals();
        //variousStringMethods();
        //concatenation1();
        //concatenation2();
        //concatenateUsingStringBuilder();
    }

    public static void equals() {
        String s1 = new String("OOP");
        String s2 = new String("OOP");

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1.equals(s2) " + s1.equals(s2));

        String s3 = "OOP";
        String s4 = "OOP";
        System.out.println("s3 == s4 " + (s3 == s4));
        System.out.println("s3.equals(s4) " + s3.equals(s4));

        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        s4 = new String("Something else");
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }

    public static void variousStringMethods() {
        String text = "The quick brown fox jumps over lazy dogs.";
        String upperCase = text.toUpperCase();
        System.out.println("Upper case text: " + upperCase);
        System.out.println("Replacing fox with wolf: " + text.replace("fox", "wolf"));
        int position = text.indexOf("quick");
        System.out.println("quick starts at index: " + position);
        System.out.println(text.substring(position, position + 15));
        System.out.println("Original: " + text);
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t" + arr[i]);
        }
        String joined = String.join(";", arr);
        System.out.println(joined);
    }

    public static void concatenation1() {
        String text = "The quick " + "brown ";
        text += "fox jumps over ";
        text += 3;
        text += " lazy dogs.";
        System.out.println(text);
    }

    public static void concatenation2() {
        int number = 3;
        String text = "The quick brown fox jumps over " + number + " lazy dogs.";
        System.out.println(text);
    }

    public static void  concatenateUsingStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("The quick ").append("brown ");
        sb.append("fox jumps over ").append(3);
        sb.append(" lazy dogs.");
        String text = sb.toString();
        System.out.println(text);
    }
}
