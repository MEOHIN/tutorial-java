package ch7_part6_programingParadigm.test.q5;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8, -3};
        int[] result = Arrays.stream(numbers)
                .filter((i) -> i > 0 )
                .toArray();
    }
}
