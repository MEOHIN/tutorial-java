package inoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\projects\\jumpto\\java\\datatype\\";

        FileWriter fw = new FileWriter(path + "sample1.txt");
        fw.write("Write once, run anywhere\n");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader(path + "sample1.txt"));
        while (true) {
            String line = br.readLine();
            if (line==null) {
                break;
            }
            System.out.println(line);  // null 이 출력된다.
        }
        br.close();
    }
}
