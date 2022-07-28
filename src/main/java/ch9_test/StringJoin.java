package ch9_test;

/**
 * 다음과 같은 문자열이 있다.
 * a:b:c:d
 * 문자열의 split와 join 메서드를 사용하여 위 문자열을 다음과 같이 고치시오.
 * a#b#c#d
 */

public class StringJoin {
    public static void main(String[] args) {
        String str = "a:b:c:d";
        String[] strArray = str.split(":");
        String result = String.join("#", strArray);
        System.out.println(result);
    }
}
