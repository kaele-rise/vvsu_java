package lab4;

public class testShape {
    public static void main(String[] args) {
        Pyramid pyr1 = new Pyramid(2, 4);
        System.out.println(pyr1);
        System.out.println(pyr1.getVolume());

        Pyramid pyr2 = new Pyramid(3, 6);
        System.out.println(pyr2);
        System.out.println(pyr2.getVolume());

        Ball bal1 = new Ball(4);
        System.out.println(bal1);
        System.out.println(bal1.getVolume());

        Box box1 = new Box(50);
        box1.add(pyr1);
        box1.add(pyr2);
        box1.add(bal1);
        System.out.println(box1);
    }
}
