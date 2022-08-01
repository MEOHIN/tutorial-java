package ch9_test.q14;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://wikidocs.net/158091
 * 문자열 형식으로 입력받은 모스 부호(dot:. dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
 *
 * 글자와 글자 사이는 공백 1개, 단어와 단어 사이는 공백 2개로 구분한다.
 * 예를 들어 다음 모스 부호는 "HE SLEEPS EARLY"로 해석해야 한다.
 * .... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--
 *
 * 모스부호 규칙
 * A	.-	    N	-.
 * B	-...	O	---
 * C	-.-.	P	.--.
 * D	-..	    Q	--.-
 * E	.	    R	.-.
 * F	..-.	S	...
 * G	--.	    T	-
 * H	....	U	..-
 * I	..	    V	...-
 * J	.---	W	.--
 * K	-.-	    X	-..-
 * L	.-..	Y	-.--
 * M	--	    Z	--..
 */

class MissMatchException extends RuntimeException{}

public class MorseCode {
    static String translate(String input){
        String[] in = input.split(" ");

        HashMap<String, String> codeSet = new HashMap<>();
        codeSet.put(".-", "A");
        codeSet.put("-...", "B");
        codeSet.put("-.-.", "C");
        codeSet.put("-..", "D");
        codeSet.put(".", "E");
        codeSet.put("..-.", "F");
        codeSet.put("--.", "G");
        codeSet.put("....", "H");
        codeSet.put("..", "I");
        codeSet.put(".---", "J");
        codeSet.put("-.-", "K");
        codeSet.put(".-..", "L");
        codeSet.put("--", "M");
        codeSet.put("-.", "N");
        codeSet.put("---", "O");
        codeSet.put(".--.", "P");
        codeSet.put("--.-", "Q");
        codeSet.put(".-.", "R");
        codeSet.put("...", "S");
        codeSet.put("-", "T");
        codeSet.put("..-", "U");
        codeSet.put("...-", "V");
        codeSet.put(".--", "W");
        codeSet.put("-..-", "X");
        codeSet.put("-.--", "Y");
        codeSet.put("--..", "Z");

        StringBuilder sb = new StringBuilder();

        for (String a : in) {
            if (codeSet.containsKey(a)) {
                try {
                    sb.append(codeSet.get(a));
                } catch (MissMatchException e) {
                    System.out.println("존재하지 않는 부호");
                }
            } else {
                sb.append(" ");
            }
        } return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("""
                모스부호를 입력하세요
                입력예시: .... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--
                출력예시: HE SLEEPS EARLY""");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(translate(in));
    }
}
