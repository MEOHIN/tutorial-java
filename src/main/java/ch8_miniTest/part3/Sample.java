package ch8_miniTest.part3;

import java.util.Scanner;

/***
 * 양의 정수를 입력 받아 그 자릿수를 출력하는 프로그램을 작성해 보자.
 * 예를 들어 3이 입력되면 1자리수 숫자이므로 1, 25가 입력되면 2, 7876이 입력되면 4를 출력해야 한다.
 *
 * 입력 받는 값: 양의 정수
 * 출력하는 값: 입력받은 숫자의 자릿수
 */

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int length = num.length();
        System.out.println(length);
    }
}
