package ch8_miniTest.part4;

import java.util.Scanner;

/***
 * 문자열을 입력받았을때 공백을 제외한 글자수만을 리턴하는 코드를 작성해 보자.
 * 즉, 어떤 문자열이 "공백을 제외한 글자수"라면 띄어쓰기를 위해 필요한 공백 문자 2개를 제외하고 9라는 숫자를 리턴해야 한다.
 *
 * 입력받는 값: 문자열
 * 출력하는 값: 공백이 제거된 문자열의 사이즈
 *
 * 입력 예시: "공백을 제외한 글자수"
 * 출력 예시: 9
 */

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
               result++;
            }
        }

        System.out.println(result);
    }
}
