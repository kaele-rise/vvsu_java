package lab4;

public class Ball extends SolidOfRevolution {
    public Ball() {
        radius = 1;
        volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

    public Ball(double radius_) {
        radius = radius_;
        volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }

    public String toString() {
        return "r=" + radius;
    }
}
