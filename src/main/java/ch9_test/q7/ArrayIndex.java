package ch9_test.q7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayIndex {
    public static void main(String[] args) {
        String[] abcFile = {"AAA", "BBB", "CCC", "DDD", "EEE"};

        Arrays.sort(abcFile, Comparator.reverseOrder());
        for (String str : abcFile) {
            System.out.println(str);
        }
    }
}
