package lab14;

import java.util.Iterator;

public class Sentence implements Iterable<String> {
    private final String[] words;

    public Sentence(String text) {
        words = text.split(" ");
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }
}
