package programingParadigm.stream;

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

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};

        // 짝수만 포함하는 ArrayList 생성한다.
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int datum : data) {
            if (datum % 2 == 0) {
                dataList.add(datum);
            }
        }

        // List 를 Set 으로 변경해서 중복을 제거한다.
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // Set 을 List 로 변경한다.
        ArrayList<Integer> dedupeDataList = new ArrayList<>(dataSet);

        // 역순으로 정렬한다.
        dedupeDataList.sort(Comparator.reverseOrder());

        // Integer 리스트를 정수 배열로 변경한다.
        int[] result = new int[dedupeDataList.size()];
        for (int i = 0; i < dedupeDataList.size(); i++) {
            result[i] = dedupeDataList.get(i);
        }
    }
}