package ch9_test.q8;

/**
 * 다음과 같이 총 10줄로 이루어진 ch9_abc.txt 파일이 있다.
 *
 * 70
 * 60
 * 55
 * 75
 * 95
 * 90
 * 80
 * 80
 * 87
 * 100
 *
 * 파일의 숫자 값을 모두 읽어 총합과 평균 값을 구한 후 평균 값을 result.txt 파일에 쓰는 프로그램을 작성하시오.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintFile {
    static String path = "C:\\projects\\jumpto\\java\\";

    static void makeFile(String fileName) throws IOException {
        PrintWriter pw = new PrintWriter(path + "ch9_result.txt");
        int total = 0;
        int i =0;

        BufferedReader br = new BufferedReader(new FileReader(path + fileName));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            total += Integer.parseInt(line);
            i++;
        }
        pw.printf("평균값: %d", total/i);
        br.close();
        pw.close();
    }

    public static void main(String[] args) throws IOException{
        makeFile("ch9_abc.txt");
    }
}
