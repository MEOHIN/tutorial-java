package ch9_test.q3;

/**
 * A학급 학생의 점수를 나타내는 정수 배열이다.
 * int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
 * 다음 배열에서 50점 이상 점수의 총합을 구하시오.
 */

public class SumNumber {
    public static void main(String[] args) {
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = 0;

        for (int i : A) {
            if (i >= 50) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
