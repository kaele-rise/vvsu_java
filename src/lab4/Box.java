package lab4;

import java.util.ArrayList;

public class Box {
    double volume;
    double used_volume;
    ArrayList<Shape> shapes;

    public Box(double volume_) {
        volume = volume_;
        used_volume = 0;
        shapes = new ArrayList<>();
    }

    boolean add(Shape shape) {
        double shapeVolume = shape.volume;
        if (used_volume + shapeVolume <= volume) {
            shapes.add(shape);
            used_volume = used_volume + shapeVolume;
            return true;
        }
        return false;
    }

    public String toString() {
        return "volume=" + volume + ", used=" + used_volume + ", shapes=" + shapes;
    }
}
