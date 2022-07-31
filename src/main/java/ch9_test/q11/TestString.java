package ch9_test.q11;

import java.util.Scanner;

/**
 * DashInsert 메서드 숫자로 구성된 문자열을 입력받은 뒤
 * 문자열 안에서 홀수가 연속되면 두 수 사이에 - 를 추가하고,
 * 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다.
 * DashInsert 메서드를 완성하시오.
 *
 * 입력 예시: 4546793
 * 출력 예시: 454*67-9-3
 */


public class TestString {
    static String DashInsert(String number) {
        StringBuilder result = new StringBuilder(String.valueOf(number.charAt(0)));
        String num = number.substring(1);
        System.out.println(num);

        int firstNum = Integer.parseInt(result.toString());

        for (int i = 0; i < num.length(); i++) {
            String secN = String.valueOf((num.charAt(i)));
            int secondNum = Integer.parseInt(secN);

            if (firstNum % 2 == 0 && secondNum % 2 == 0) {
                result.append("*").append(secondNum);
            } else if (firstNum % 2 != 0 && secondNum % 2 != 0) {
                result.append("-").append(secondNum);
            } else {
                result.append(secondNum);
            }
            firstNum = secondNum;
            }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("숫자를 네 자리 이상 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(DashInsert(in));
    }
}
