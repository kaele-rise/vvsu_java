package lab6;

import java.util.Collections;
import java.util.ArrayList;

public class testFraction {
    public static void main(String[] args) {
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(1, 2));
        fractions.add(new Fraction(2, 3));
        fractions.add(new Fraction(-1, 3));
        fractions.add(new Fraction(0, 1));
        fractions.add(new Fraction(5, 6));


        Collections.sort(fractions, Fraction.ascendingOrder());
        System.out.println("По возрастанию: " + fractions);

        Collections.sort(fractions, Fraction.descendingOrder());
        System.out.println("По убыванию: " + fractions);

        Collections.sort(fractions, Fraction.ascendingAbsOrder());
        System.out.println("По возрастанию абс. знач.: " + fractions);

        Collections.sort(fractions, Fraction.descendingAbsOrder());
        System.out.println("По убыванию абс. знач.: " + fractions);
    }
}
