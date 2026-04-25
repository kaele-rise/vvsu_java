package lab6_1;
import java.util.Comparator;

public class Car {
    public enum Priority {
        ORDINARY,
        POLICE,
        AMBULANCE
    }

    private static int nextId = 0;

    String model;
    String licensePlate;
    Priority priority;
    private final int id;

    public Car(String model_, String license_plate_, Priority priority_) {
        model = model_;
        licensePlate = license_plate_;
        priority = priority_;
        this.id = ++nextId;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return model + " " + licensePlate + " (" + priority + ") " + id;
    }

    public static Comparator<Car> ambulanceFirst() {
        return (c1, c2) -> {
            int p1 = priorityToIntAmbulanceFirst(c1.priority);
            int p2 = priorityToIntAmbulanceFirst(c2.priority);
            if (p1 != p2) {
                return Integer.compare(p1, p2);
            }
            return Integer.compare(c1.id, c2.id);
        };
    }

    private static int priorityToIntAmbulanceFirst(Priority p) {
        switch (p) {
            case AMBULANCE: return 0;
            case POLICE:    return 1;
            case ORDINARY:  return 2;
            default:        return 3;
        }
    }

    public static Comparator<Car> policeFirst() {
        return (c1, c2) -> {
            int p1 = priorityToIntPoliceFirst(c1.priority);
            int p2 = priorityToIntPoliceFirst(c2.priority);
            if (p1 != p2) {
                return Integer.compare(p1, p2);
            }
            return Integer.compare(c1.id, c2.id);
        };
    }

    private static int priorityToIntPoliceFirst(Priority p) {
        switch (p) {
            case POLICE:    return 0;
            case AMBULANCE: return 1;
            case ORDINARY:  return 2;
            default:        return 3;
        }
    }
}