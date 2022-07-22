package ch7_part6_programingParadigm.lambda;

import java.util.function.BinaryOperator;

public class Sample {
    public static void main(String[] args) {
        BinaryOperator<Integer> mc = Integer::sum;
        int result =  mc.apply(3, 4);
        System.out.println(result);    // 7 출력
    }
}