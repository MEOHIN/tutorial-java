package ch9_test.q2;

/**
 * 'C'에 해당하는 key 값이 없을 경우 null 대신 70을 얻을 수 있도록 수정하시오.
 */

import java.util.HashMap;

public class Sample {
    public static void main(String[] args)  {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);

        System.out.println(a.getOrDefault("C", 70));
    }
}
