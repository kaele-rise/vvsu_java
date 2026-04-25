package lab7;

public class testGenericStack {
    public static void main(String[] args) {
        GenericStack array1 = new GenericStack<>();
        array1.push("1");
        array1.push("2");
        array1.push("3");

        System.out.println(array1);

        array1.push("4");
        array1.push("5");
        array1.push("6");

        System.out.println(array1);
    }
}
