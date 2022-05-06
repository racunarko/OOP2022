package hr.fer.oop.labosi.lab03.zad02;

public class Main {
    public static void main(String[] args) throws InvalidStatisticsException {
        GeometricStatistics<Float> gs3 = new GeometricStatistics<>();
        gs3.addElement((float) 1.5);
        gs3.addElement((float) 5.5);
        gs3.addElement((float) 6.2);
        gs3.addElement((float) 12.4);

        System.out.println(gs3.getProduct());         // 634.2599609756476
        System.out.println(gs3.getMean());        // 5.018417906034013
        System.out.println(gs3.getMin());         // 1.5
        System.out.println(gs3.getMax());         // 12.4
    }
}
