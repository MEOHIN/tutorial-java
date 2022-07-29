package ch9_test.q10;

/**
 * 아래 프로그램은 10회의 execute 메서드 호출 시 입력 숫자가 홀수인 경우 프로그램이 즉시 종료된다.
 * OddException이 발생하더라도 프로그램이 종료되지 않고 10회 모두 호출될 수 있도록 프로그램을 수정하시오.
 */

import java.util.Random;

class OddException extends Exception {
}

public class Sample {
    static void execute(int n) throws OddException {
        System.out.printf("입력 숫자: %d\n", n);
        if (n % 2 == 1) {  // 홀수이면 OddException이 발생한다.
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }

    public static void main(String[] args) {
        Random r = new Random();
        try {
            for (int i = 0; i < 10; i++) {
                execute(r.nextInt(10));
            }
        } catch (OddException e) {
            e.printStackTrace();
        }
    }
}
