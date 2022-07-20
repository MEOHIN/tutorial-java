package lambda;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;
        int result =  mc.sum(3, 4);
        System.out.println(result);    // 7 출력
    }
}