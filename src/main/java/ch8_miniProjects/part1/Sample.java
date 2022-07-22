package ch8_miniProjects.part1;

public class Sample {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
