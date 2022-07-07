package dataType;

public class Average {

    public void AverageScore (int kor, int eng, int math) {
        int sum = kor + eng + math;
        int total = sum/3;

        System.out.println("홍길동 씨의 평균 점수: " + total);
    }

    public static void main(String[] args) {
        int kor = 80;
        int eng = 75;
        int math = 55;

        Average average = new Average();
        average.AverageScore(kor, eng, math);
    }
}
