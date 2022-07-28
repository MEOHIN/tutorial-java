package ch9_test.q5;

import java.util.Scanner;

/**
 * 사용자로부터 2~9의 숫자 중 하나를 입력받아 해당 숫자의 구구단을 한 줄로 출력하는 프로그램을 작성하시오.
 *
 * 실행 예시
 * 구구단을 출력할 숫자를 입력하세요(2~9): 2
 * 2 4 6 8 10 12 14 16 18
 */

public class Gugudan {
    static void dan(int num) {
//        for (int i = 2; i <= num; i++){
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%d * %d = %d \n", i, j, i*j);
//            }
//        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d ", num*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.printf("구구단을 출력할 숫자를 입력하세요(2~9): %d \n", num);
        dan(num);
    }
}
