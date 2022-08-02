package ch9_test.q15;

import java.util.Scanner;

/**
 * 시저 암호는 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호다.
 * 알파벳 A를 입력했을 때, 그 알파벳의 n개 뒤에 오는 알파벳이 출력된다.
 * 예를 들어 바꾸려는 단어가 "CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
 *
 * 어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성하시오.
 *
 * ※ 알파벳은 A~Z 까지의 대문자만 사용한다.
 *
 * 입력 예시: "CAT", 5
 * 출력 예시: "HFY"
 */

public class CaesarCode {
    static void translate(String inStr, int inNum) {
        StringBuilder sbIn = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sbIn.append((char) (65+i));
        }
        String alphabet = sbIn.toString();

        StringBuilder sbOut = new StringBuilder();
        for (int j = 0; j < inStr.length(); j++) {
            int n = alphabet.indexOf(inStr.charAt(j));
            System.out.printf("입력어 알파벳 순: %d\n",n);
            int outNum = n + inNum;
            outNum = outNum % alphabet.length();
            System.out.printf("출력어 알파벳 순: %d\n",outNum);
            sbOut.append(alphabet.charAt(outNum));
        }
        System.out.println(sbOut);
    }

    public static void main(String[] args) {
        System.out.println("영어 대문자로 이루어진 단어 또는 문장을 입력하세요.\n입력 예시: CAT");
        Scanner sc1 = new Scanner(System.in);
        String inStr = sc1.nextLine();

        System.out.println("숫자를 입력하세요\n입력 예시: 5");
        Scanner sc2 = new Scanner(System.in);
        int inNum = sc2.nextInt();

        translate(inStr, inNum);
    }
}