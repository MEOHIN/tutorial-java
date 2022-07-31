package ch9_test.q13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 0~9의 문자로 조합된 숫자를 입력받았을 때,
 * 이 때 0~9의 모든 숫자를 각각 한 번씩 사용해야하고 중복이 있어서는 안된다.
 *
 * 입력 예시: 0123456789 01234 01234567890 6789012345 012322456789
 * 출력 예시: true false false true false
 */

public class TestNum {
    static void checkDuplicate(String num) {
        String[] strArray = num.split(" ");
        for (String str : strArray) {
            if (str.length() != 10) {
                System.out.println(false);
            } else {
                String[] dataArray = str.split("");
                HashSet<String> strSet = new HashSet<>(Arrays.asList(dataArray));

                System.out.println(str.length() == strSet.size());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("""
                0~9의 숫자를 조합하여 두 세트 이상 입력하세요.
                씌어쓰기로 세트를 구분합니다.
                예시: 0123456789 01234 01234567890 6789012345 012322456789""");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        checkDuplicate(in);
    }
}
