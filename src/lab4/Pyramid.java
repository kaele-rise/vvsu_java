package lab4;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid() {
        s = 1;
        h = 1;
        volume = (1.0 / 3.0) * s * h;
    }

    public Pyramid(double s_, double h_) {
        s = s_;
        h = h_;
        volume = 1.0 / 3.0 * s * h;
    }

    public String toString() {
        return "s=" + s + ", h=" + h;
    }
}
