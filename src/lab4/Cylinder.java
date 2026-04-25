package lab4;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder() {
        radius = 1;
        height = 1;
        volume = height * 3.14 * radius * radius;
    }

    public Cylinder(double radius_, double height_) {
        radius = radius_;
        height = height_;
        volume = height * 3.14 * radius * radius;
    }

    public String toString() {
        return "r=" + radius + ", h=" + height;
    }
}
