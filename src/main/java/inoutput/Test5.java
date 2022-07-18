package inoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test5 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\projects\\jumpto\\java\\datatype\\sample3.txt";
        String sentence = "Life is too short\nyou need python";

        PrintWriter pw1 = new PrintWriter(path);
        pw1.println(sentence);
        pw1.close();

        BufferedReader br1 = new BufferedReader(new FileReader(path));
        while (true) {
            String line1 = br1.readLine();
            if (line1 == null) {break;}
            System.out.println(line1);
        }
        br1.close();

        PrintWriter pw2 = new PrintWriter(path);
        pw2.println(sentence.replaceAll("python", "java"));
        pw2.close();

        BufferedReader br2 = new BufferedReader(new FileReader(path));
        while (true) {
            String line2 = br2.readLine();
            if (line2 == null) {break;}
            System.out.println(line2);
        }
        br2.close();
    }
}