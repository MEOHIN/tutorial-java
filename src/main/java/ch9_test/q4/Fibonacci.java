package ch9_test.q4;

import java.util.Scanner;

/**
 * 입력을 정수 n으로 받았을 때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성해 보자.
 * 피보나치 수열의 예시: 0, 1, 1, 2, 3, 5, 8, 13, ...
 */

public class Fibonacci {
    static void getFibonacci(int num) {

        int firstNum = 0;
        int secondNum = 1;
        System.out.println(firstNum);
        System.out.println(secondNum);

        while (true) {
            int nextNum = firstNum + secondNum;
            System.out.println(nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
            if (nextNum >=num) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        getFibonacci(num);
    }
}
