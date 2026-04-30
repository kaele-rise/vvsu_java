package lab13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

@FunctionalInterface
interface StringComparator {
    String longer(String s1, String s2);
}

public class LongestString {
    public static void main(String[] args) {
        StringComparator comparator = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;

        Path filePath = Paths.get("src/lab13/text.txt");
        try (Stream<String> lines = Files.lines(filePath)) {
            Optional<String> longest = lines.reduce(comparator::longer);
            longest.ifPresent(System.out::println);
        } catch (IOException e) {
            System.err.println("" + e.getMessage());
        }
    }
}