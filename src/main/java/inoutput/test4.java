package inoutput;

import java.io.*;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\projects\\jumpto\\java\\datatype\\";
        PrintWriter pw = new PrintWriter(new FileWriter(path + "sample2.txt", true));

        System.out.println("입력하세요:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        pw.println(input);
        pw.close();

        BufferedReader br = new BufferedReader(new FileReader(path + "sample2.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        br.close();
    }
}
