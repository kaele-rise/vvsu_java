package lab8;

public class testIntContainer {
    public static void main(String[] args) {
        IntContainer cont1 = new IntContainer();

        try {
            cont1.pop();
        } catch (EmptyException e) {
            System.out.println("" + e.getMessage());
        }

        try {
            cont1.sort();
        } catch (SortException e) {
            System.out.println("" + e.getMessage());
        }

        try {
            cont1.push(1);
            cont1.push(1);
            cont1.push(1);
            cont1.push(1);
            cont1.push(1);
            cont1.push(1);
        } catch (FullException e) {
            System.out.println("" + e.getMessage());
        }

        System.out.println(cont1);

        try {
            cont1.sort();
        } catch (SortException e) {
            System.out.println("" + e.getMessage());
        }

        try {
            cont1.find(1);
        } catch (MultipleException e) {
            System.out.println("" + e.getMessage());
        }
    }
}
