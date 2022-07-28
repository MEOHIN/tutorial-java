package ch9_test.q7;
/**
 * 다음과 같은 내용의 파일 abc.txt가 있다.
 *
 * AAA
 * BBB
 * CCC
 * DDD
 * EEE
 *
 * 이 파일의 내용을 다음과 같이 역순으로 바꾸어 result.txt 파일에 저장하시오.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class EditFile {
    static String path = "C:\\projects\\jumpto\\java\\";
    static String[] abcFile = {"AAA", "BBB", "CCC", "DDD", "EEE"};

    static void makeFile() throws IOException {
        PrintWriter pw = new PrintWriter(path + "abc.txt");

        for (String abcText : abcFile) {
            pw.println(abcText);
        }
        pw.close();
    }

    static void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path + fileName));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
        br.close();
    }

    static void editFile() throws IOException {
        Arrays.sort(abcFile, Comparator.reverseOrder());

        PrintWriter pw = new PrintWriter(path + "result.txt");
        for (String str : abcFile) {
            pw.println(str);
        }
        pw.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("abc.txt");
        makeFile();
        readFile("abc.txt");

        System.out.println("result.txt");
        editFile();
        readFile("result.txt");
    }
}
