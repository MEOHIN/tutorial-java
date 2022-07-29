package ch9_test.q9;

/**
 * 다음과 같이 동작하는 클래스 Calculator를 작성하시오.
 *
 * public class Sample {
 *     public static void main(String[] args) {
 *         int[] data1 = {1,2,3,4,5};
 *         Calculator cal1 = new Calculator(data1);
 *         System.out.println(cal1.sum()); // 15 출력
 *         System.out.println(cal1.avg()); // 3.0 출력
 *
 *         int[] data2 = {6,7,8,9,10};
 *         Calculator cal2 = new Calculator(data2);
 *         System.out.println(cal2.sum()); // 40 출력
 *         System.out.println(cal2.avg()); // 8.0 출력
 *     }
 * }
 */

class Calculator {
    int[] data;

    Calculator(int[] data) {
        this.data = data;
    }

    int sum() {
        int total = 0;
        for (int num : this.data) {
            total += num;
        }
        return total;
    }

    float avg() {
        return (float) (sum()/this.data.length);
    }
}

public class Sample {
    public static void main(String[] args) {
        int[] data1 = {1, 2, 3, 4, 5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum());
        System.out.println(cal1.avg());

        int[] data2 = {6, 7, 8, 9, 10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum());
        System.out.println(cal2.avg());
    }
}
