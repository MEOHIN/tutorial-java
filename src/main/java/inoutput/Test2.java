package inoutput;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력을 마치려면 END 를 입력하하세요.");

        while (true) {
            System.out.println("영문을 입력하하세요.");
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }
            System.out.println(input.toUpperCase());
        }
    }
}
