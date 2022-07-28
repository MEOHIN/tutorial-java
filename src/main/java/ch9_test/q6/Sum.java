package ch9_test.q6;

/**
 * 사용자로부터 다음과 같은 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램을 작성하시오.
 * (단 숫자는 콤마로 구분하여 입력한다.)
 * 65,45,2,3,45,8
 */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("숫자를 입력해주세요.\n2개 이상을 입력할 땐 공백없이 콤마(,)로 구분해 주세요.\n입력완료는 엔터를 누르세요");

        Scanner sc = new Scanner(System.in);
        String strNum = sc.nextLine();
        String[] ArrayNum = strNum.split(",");

        int result = 0;
        for (String n : ArrayNum) {
            int num = Integer.parseInt(n);
            result += num;
        }
        System.out.printf("입력한 숫자의 총 합은 %d 입니다." ,result);
    }
}
