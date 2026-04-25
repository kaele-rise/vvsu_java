package lab4;

public class SolidOfRevolution extends Shape {
    double radius;

    public SolidOfRevolution() { radius = 1; }
    public SolidOfRevolution(double radius_) {
        radius = radius_;
    }

    public double getRadius() {
        return radius;
    }
}
