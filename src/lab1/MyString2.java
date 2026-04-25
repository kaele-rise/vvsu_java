package lab1;

public class MyString2 {
    char[] chars;
    int length;

    public MyString2(char[] chars_) {
        chars = chars_;
        length = chars.length;
    }

    public MyString2 substring(int begin) {
        int newLength = length - begin;
        char[] newChars = new char[newLength];
        for (int i = 0; i < newLength; i++) {
            newChars[i] = chars[begin + i];
        }
        return new MyString2(newChars);
    }

    public MyString2 substring(int begin, int end) {
        int newLength = end - begin;
        char[] newChars = new char[newLength];
        for (int i = 0; i < newLength; i++) {
            newChars[i] = chars[begin + i];
        }
        return new MyString2(newChars);
    }

    public boolean equals(Object obj) {
        if (chars == obj) return true;
        if (getClass() != obj.getClass()) return false;
        MyString2 other = (MyString2) obj;
        if (this.length != other.length) return false;
        for (int i = 0; i < length; i++) {
            if (this.chars[i] != other.chars[i]) return false;
        }
        return true;
    }

    public int compareTo(MyString2 obj) {
        int minLen = Math.min(this.length, obj.length);
        for (int i = 0; i < minLen; i++) {
            if (this.chars[i] != obj.chars[i]) {
                return this.chars[i] - obj.chars[i];
            }
        }
        return this.length - obj.length;
    }

    public char[] toChars() {
        char[] copy = new char[length];
        for (int i = 0; i < length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public static MyString2 valueOf(boolean b) {
        if (b) {
            return new MyString2(new char[]{'t', 'r', 'u', 'e'});
        } else {
            return new MyString2(new char[]{'f', 'a', 'l', 's', 'e'});
        }
    }

    public String toString() {
        return new String(chars);
    }
}
