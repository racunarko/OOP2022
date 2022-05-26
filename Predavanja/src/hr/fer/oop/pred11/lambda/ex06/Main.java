package hr.fer.oop.pred11.lambda.ex06;

import hr.fer.oop.pred11.lambda.Car;
import hr.fer.oop.pred11.lambda.CarCatalog;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = CarCatalog.loadCars();
        theMostSimilarCar(cars,
                Main::distance,
                (car, car2) -> System.out.printf("The most similar are: \n\t%s\n\t%s\n", car, car2)
                );
    }

    private static int distance(Car a, Car b) {
        return (int) Math.abs(a.getPrice() - b.getPrice());
    }
    public static void theMostSimilarCar(Iterable<Car> cars, BiFunction<Car, Car, Integer> distanceFunction, BiConsumer<Car, Car> action) {

        class CarPair {
            public Car first, second;
            public CarPair (Car first, Car second) {
                this.first = first;
                this.second = second;
            }
        }

        CarPair pair = null;
        int min = Integer.MAX_VALUE;

        for (Car first : cars) {
            for (Car second : cars) {
                if (first == second) continue;
                int distance = distanceFunction.apply(first, second);
                if (pair == null || distance < min) {
                    pair = new CarPair(first, second);
                    min = distance;
                }
            }
        }

        if (pair != null) {
            action.accept(pair.first, pair.second);
        }

    }
}
