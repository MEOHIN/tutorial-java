package ch7_part6_programingParadigm.stream;

/*** 문제
 * 다음과 같은 정수 배열이 있다.
 *
 * int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
 * 이 배열에서 짝수만 찾아 중복을 제거한 후에 역순으로 정렬하는 프로그램을 작성하시오.
 *
 * 즉, 프로그램의 수행 결과는 다음과 같아야 한다.
 *
 * int[] result = {8, 6, 4, 2};
 */

import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data)    // IntStream 을 생성한다.
                .boxed()    // IntStream 을 Stream<Integer> 로 변경한다: Comparator.reverseOrder() 에서 Integer 가 필요하기 때문이다.
                .filter((i) -> i % 2 == 0)    // 짝수를 선별한다.
                .distinct()    // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())    // 역순으로 정렬한다.
                .mapToInt(Integer::intValue)    // Stream<Integer> 를 IntStream 으로 변경한다: 최종적으로 int[] 타입을 반환해야하기 때문이다.
                .toArray();    // int[] 배열로 반환한다.
    }
}