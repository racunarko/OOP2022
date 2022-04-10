package hr.fer.oop.pred02.simple;

public class IspisiArgumente {
    public static void main(String[] args) {
        //C: argc - count argv - vektor elemenata
        //Java: args
        System.out.println(args.length);
        System.out.println(args[1]+1);
        int number = Integer.parseInt(args[1]);
        number++;
        System.out.println(number);
    }
}
