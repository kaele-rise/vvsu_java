package lab1;

public class testMyCharacter {
    public static void main(String[] args) {
        MyCharacter char_1 = new MyCharacter('a');
        System.out.println(char_1.charValue());
        MyCharacter char_2 = new MyCharacter('b');
        System.out.println(char_1.equals(char_2));

        MyCharacter char_3 = new MyCharacter('t');
        MyCharacter char_4 = new MyCharacter('9');
        System.out.println(char_3.compareTo(char_4));
        System.out.println(char_4.isDigit());
        System.out.println(char_1.isDigit());
        System.out.println(MyCharacter.isLetter(char_1));

    }
}
