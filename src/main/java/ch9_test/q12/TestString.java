package ch9_test.q12;

import java.util.Scanner;

/**
 * 문자열을 입력받아 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시해 문자열을 압축하여 표시하시오.
 *
 * 입력 예시: aaabbccccccaa
 *
 * 변수에 첫번째 문자를 대입한다.
 * 대입한 변수와 다음 문자를 비교해서 같으면 증가.
 * 대입한 변수와 다음 문자를 비교해서 다르면 변수를 대입한다.
 *
 * 출력 예시: a3b2c6a2
 */

public class TestString {
    static String initString(String str) {
        StringBuilder result = new StringBuilder();
        String firstChar = String.valueOf(str.charAt(0));
        int j = 0;

        for (int i = 0; i < str.length(); i++) {
            String secondChar = String.valueOf(str.charAt(i));
            if (secondChar.equals(firstChar)) {
                j++;
            } else {
                result.append(firstChar).append(j);
                firstChar = secondChar;
                j = 1;
            }
            if (i == str.length()-1) {
                result.append(firstChar).append(j);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("두 글자 이상 반복되는 문자를 입력해주세요.\n예시: aaabbccccccaa");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(initString(in));
    }
}
