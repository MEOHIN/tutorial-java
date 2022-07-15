package inoutput;

import java.util.Scanner;

public class teat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("첫 번째 숫자 입력 : ");
        int firstNum = input.nextInt();

        System.out.println("두 번째 숫자 입력 : ");
        int secondNum = input.nextInt();

        System.out.println("첫 번째 숫자 + 두 번째 숫자 = " + (firstNum+secondNum));
    }
}
