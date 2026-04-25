package lab1;

public class MyCharacter {
    char character;

    MyCharacter(char value) {
        character = value;
    }

    char charValue() {
        return character;
    }

    int compareTo (MyCharacter anotherCharacter) {
        return character - anotherCharacter.character;
    }

    @Override
    public boolean equals(Object anotherCharacter) {
        if (this == anotherCharacter) {
            return true;
        }
        if (getClass() != anotherCharacter.getClass()) return false;
        MyCharacter that = (MyCharacter) anotherCharacter;
        return character == that.character;
    }

    boolean isDigit() {
        return MyCharacter.isDigit(this);
    }

    static boolean isDigit(MyCharacter ch) {
        return Character.isDigit(ch.charValue());
    }

    static boolean isLetter(MyCharacter ch) {
        return Character.isLetter(ch.charValue());
    }

   static boolean isLetterOrDigit(MyCharacter ch) {
        return Character.isLetterOrDigit(ch.charValue());
    }

}
