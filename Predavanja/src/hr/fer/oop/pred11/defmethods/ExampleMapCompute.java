package hr.fer.oop.pred11.defmethods;

import hr.fer.oop.pred11.lambda.Car;
import hr.fer.oop.pred11.lambda.CarCatalog;
import hr.fer.oop.pred11.lambda.CarType;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ExampleMapCompute {
    public static void main(String[] args) {
        Map<CarType, Integer> carTypesCount = new HashMap<>();
        List<Car> cars = CarCatalog.loadCars();
        cars.forEach(new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                Integer newVal = carTypesCount.compute(car.getType(), new BiFunction<CarType, Integer, Integer>() {
                    @Override
                    public Integer apply(CarType key, Integer value) {
                        return value == null ? 1 : value + 1;
                    }
                });
                System.out.printf("%s raises number of %s cars to %d\n", car.getName(), car.getType(), newVal);
            }
        });
        System.out.println();

        carTypesCount.forEach(new BiConsumer<CarType, Integer>() {
            @Override
            public void accept(CarType carType, Integer integer) {
                System.out.println(carType + " occurred " + integer + " times");
            }
        });
    }
}
