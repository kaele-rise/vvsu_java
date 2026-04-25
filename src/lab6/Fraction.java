package lab6;
import java.util.Comparator;

public class Fraction implements Comparable<Fraction> {
    int numerator;
    int denominator;

    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }

    @Override
    public int compareTo(Fraction other) {
        long left = (long) this.numerator * other.denominator;
        long right = (long) other.numerator * this.denominator;
        return Long.compare(left, right);
    }

    @Override
    public String toString() {
        return "" + numerator + "/" + denominator;
    }

    public Fraction abs() {
        return new Fraction(Math.abs(numerator), denominator);
    }

    public static Comparator<Fraction> ascendingOrder() {
        return Comparator.naturalOrder();
    }

    public static Comparator<Fraction> descendingOrder() {
        return Comparator.reverseOrder();
    }

    public static Comparator<Fraction> ascendingAbsOrder() {
        return Comparator.comparing(Fraction::abs);
    }

    public static Comparator<Fraction> descendingAbsOrder() {
        return Comparator.comparing(Fraction::abs, Comparator.reverseOrder());
    }
}
