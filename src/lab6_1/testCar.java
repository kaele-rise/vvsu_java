package lab6_1;
import java.util.PriorityQueue;

public class testCar {
    public static void main(String[] args) {
        Car carOrd1 = new Car("toyota", "B123KB", Car.Priority.ORDINARY);
        Car carOrd2 = new Car("nissan", "P020CM", Car.Priority.ORDINARY);
        Car carPol1 = new Car("skoda", "AA0154", Car.Priority.POLICE);
        Car carOrd3 = new Car("suzuki", "H556KK", Car.Priority.ORDINARY);
        Car carAmb1 = new Car("ford", "O304OP", Car.Priority.AMBULANCE);

        PriorityQueue<Car> queueAmb = new PriorityQueue<>(Car.ambulanceFirst());
        queueAmb.add(carOrd1);
        System.out.println("Заезжает: " + carOrd1);
        queueAmb.add(carOrd2);
        System.out.println("Заезжает: " + carOrd2);
        queueAmb.add(carPol1);
        System.out.println("Заезжает: " + carPol1);
        queueAmb.add(carOrd3);
        System.out.println("Заезжает: " + carOrd3);
        queueAmb.add(carAmb1);
        System.out.println("Заезжает: " + carAmb1);

        System.out.println("Сначала медицинские:");
        while (!queueAmb.isEmpty()) {
            System.out.println("Заправляется: " + queueAmb.poll());
        }
        System.out.println();


        PriorityQueue<Car> queuePol = new PriorityQueue<>(Car.policeFirst());
        queuePol.add(carOrd1);
        queuePol.add(carOrd2);
        queuePol.add(carPol1);
        queuePol.add(carOrd3);
        queuePol.add(carAmb1);

        System.out.println("Сначала служебные:");
        while (!queuePol.isEmpty()) {
            System.out.println("Заправляется: " + queuePol.poll());
        }

    }
}
