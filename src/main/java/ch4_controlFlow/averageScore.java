package ch4_controlFlow;

public class averageScore {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum = 0;

        for (int score : marks
             ) {
            sum += score;

            if (score == 100) {
                int average = sum/marks.length;
                System.out.println(average);
            }
        }
    }
}
