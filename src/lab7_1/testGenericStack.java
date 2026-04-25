package lab7_1;

import java.util.ArrayList;


public class testGenericStack {
    public static void main(String[] args) {
        GenericStack array1 = new GenericStack();
        array1.push("1");
        array1.push("2");
        array1.push("3");

        System.out.println(array1);

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("4");
        array2.add("5");
        array2.add("6");
        array2.add("3");
        array2.add("4");



        array1.pushUnique(array2);
        System.out.println(array1);
    }
}
