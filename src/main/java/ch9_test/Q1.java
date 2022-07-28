package ch9_test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 다음과 같은 문자열이 있다.
 * a:b:c:d
 * 문자열의 split와 join 메서드를 사용하여 위 문자열을 다음과 같이 고치시오.
 * a#b#c#d
 */

public class Q1 {
    public static void main(String[] args) {
        String str = "a:b:c:d";
        String[] strArray = str.split(":");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));
        String result = "";

        for (String s : strList) {
            result += s;
            result += "#";
        }
        result = result.substring(0, result.length()-1);
        System.out.println(result);
    }
}
