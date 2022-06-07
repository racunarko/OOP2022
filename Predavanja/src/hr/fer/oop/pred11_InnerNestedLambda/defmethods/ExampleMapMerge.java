package hr.fer.oop.pred11_InnerNestedLambda.defmethods;

import hr.fer.oop.pred11_InnerNestedLambda.lambda.Car;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarCatalog;
import hr.fer.oop.pred11_InnerNestedLambda.lambda.CarType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ExampleMapMerge {
    public static void main(String[] args) {
        Map<CarType, Integer> carTypesCount = new HashMap<>();
        List<Car> cars = CarCatalog.loadCars();

        cars.forEach(new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                carTypesCount.merge(car.getType(), 1, new BiFunction<Integer, Integer, Integer>() {
                    @Override
                    public Integer apply(Integer oldValue, Integer value) {
                        return oldValue + value;
                    }
                });
            }
        });
        System.out.println(carTypesCount);
    }
}
