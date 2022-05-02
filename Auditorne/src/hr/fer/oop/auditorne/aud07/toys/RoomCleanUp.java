package hr.fer.oop.auditorne.aud07.toys;

import hr.fer.oop.auditorne.aud07.list.MyList;

public class RoomCleanUp {
    public static void main(String[] args) {
        MyList<PlasticBag<? extends Toy>> bags = new MyList<>();
        MyList<CardBox<? extends Toy>> boxes = new MyList<>();

        try {
            PlasticBag<CarToy> bag1 = new PlasticBag<>();
            CarToy car1 = new CarToy(500, "The red car");
            bag1.addToy(car1);
            CarToy car2 = new CarToy(1500, "The bulldozer");
            bag1.addToy(car2);
            bags.add(bag1);

            PlasticBag<TeddyBearToy> bag2 = new PlasticBag<>();
            TeddyBearToy bear = new TeddyBearToy(2000, "Small brown teddy");
            bag2.addToy(bear);
            bags.add(bag2);

            CardBox<TeddyBearToy> box1 = new CardBox<TeddyBearToy>();
            TeddyBearToy bear1 = new TeddyBearToy(15000, "Teddy with blue eyes");
            box1.addToy(bear1);
            TeddyBearToy bear2 = new TeddyBearToy(7000, "Small teddy");
            box1.addToy(bear2);
            TeddyBearToy bear3 = new TeddyBearToy(22000, "Big brown teddy missing one ear");
            box1.addToy(bear3);
            boxes.add(box1);

//            TeddyBearToy doesntFit = new TeddyBearToy(22000, "Too big teddy :(");
//            box1.addToy(doesntFit);
        } catch (TooLittleSpace e) {
            e.printStackTrace();
        }

        bags.print();
        boxes.print();

        MyList<Toy> toys = firstFromEachContainer(bags);
        toys.print();

        toys = firstFromEachContainer(boxes);
        toys.print();
    }

    private static <C extends Container<?>>  MyList<Toy> firstFromEachContainer(MyList<C> containers) {
        MyList<Toy> list = new MyList<>();
        for(int i=0, size = containers.size(); i<size; i++) {
            C container = containers.elementAt(i);
            if (container.getNoOfToys() > 0) {
                Toy t = container.getToy(0);
                list.add(t);
            }
        }
        return list;
    }
}
