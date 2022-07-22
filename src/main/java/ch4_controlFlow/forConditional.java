package ch4_controlFlow;

public class forConditional {
    public static void main(String[] args) {
        String star = "*";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println("\n");
        }
    }
}
