package lab13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface NumberChecker {
    boolean test(int number);
}

public class Filter13 {
    public static void main(String[] args) {
        NumberChecker divisibleBy13 = n -> n % 13 == 0;

        Path inputFile = Paths.get("src/lab13/numbers.txt");
        Path outputFile = Paths.get("src/lab13/filtered.txt");

        try (Stream<String> lines = Files.lines(inputFile)) {
            List<String> filtered = lines
                    .map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .filter(line -> {
                        int number = Integer.parseInt(line);
                        return !divisibleBy13.test(number);
                    })
                    .collect(Collectors.toList());

            Files.write(outputFile, filtered);

        } catch (IOException e) {
            System.err.println("" + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("" + e.getMessage());
        }
    }
}