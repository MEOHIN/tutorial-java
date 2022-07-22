package ch8_miniProjects.part1;

/***
 * 1000 미만의 자연수에서 3의 배수와 5의 배수의 총합을 구하라.
 */

public class Sample {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
