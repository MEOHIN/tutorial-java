package ch4_controlFlow;

public class whileConditional {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while ( i <= 1000) {
            if (i % 3 == 0) {
                sum += i;
                }
            if (i == 1000) {
                System.out.println(sum);
            }
            i++;
        }
    }
}
