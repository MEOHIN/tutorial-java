package ch7_part6_programingParadigm.test.q4;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers)
                .filter((i) -> i % 2 == 1)
                .map((i) -> i * 2)
                .toArray();
    }
}
