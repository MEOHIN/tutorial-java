package objectOrientedProgrming.test.q4;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    int avg(int[] list) {
        int sum = 0;

        for (int i : list)  sum += i;

        return sum/list.length;
    }

    int avg(ArrayList<Integer> list) {
        int sum = 0;

        for (int j : list)  sum += j;

        return sum/list.size();
    }
}

public class Sample {
    public static void main(String[] args) {
        int[] data1 = {1, 3, 5, 7, 9};
        Calculator cal1 = new Calculator();
        int result1 = cal1.avg(data1);
        System.out.println(result1);  // 5 출력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Calculator cal2 = new Calculator();
        int result2 = cal2.avg(data2);
        System.out.println(result2);  // 5 출력
    }
}

