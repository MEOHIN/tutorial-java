package objectOrientedProgrming.test.q5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());    // 4 출력

        /* a 와 b 가 동일한 리스트 객체를 가리킨다. */

        // a 와 b 가 동일한 객체인지 확인한다.
        System.out.println(a==b);
    }
}
