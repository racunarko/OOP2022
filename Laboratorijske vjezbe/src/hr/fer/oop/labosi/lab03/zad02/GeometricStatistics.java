package hr.fer.oop.labosi.lab03.zad02;

import java.util.LinkedList;
import java.util.List;

class GeometricStatistics<T extends Number> {
    List<T> stats= new LinkedList<>();
    public void addElement(T t) throws IllegalArgumentException{
        if (t.doubleValue() > 0) {
            stats.add(t);
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public double getProduct() throws InvalidStatisticsException {
        double prod = (double) 1;
        if (stats.size() == 0) {
            throw new InvalidStatisticsException();
        }
        for (T stat : stats) {
            prod = prod * stat.doubleValue();
        }
        return prod;
    }

    public double getMean() throws InvalidStatisticsException {
        if (stats.size() == 0) {
            throw new InvalidStatisticsException();
        }
        return Math.pow(getProduct(), 1. / stats.size());
    }

    public T getMax() throws InvalidStatisticsException {
        if (stats.size() == 0) {
            throw new InvalidStatisticsException();
        }

        T max = stats.get(0);

        for (int i = 1; i < stats.size(); i++) {
            if (max.doubleValue() < stats.get(i).doubleValue()) {
                max = stats.get(i);
            }
        }
        return max;

    }

    public T getMin() throws InvalidStatisticsException {
        if (stats.size() == 0) {
            throw new InvalidStatisticsException();
        }
        T min = stats.get(0);

        for (int i = 1; i < stats.size(); i++) {
            if (min.doubleValue() > stats.get(i).doubleValue()) {
                min = stats.get(i);
            }
        }
        return min;
    }
}
