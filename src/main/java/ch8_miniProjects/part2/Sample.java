package ch8_miniProjects.part2;

/***
 * 게시물의 총 건수와 한 페이지에 보여 줄 게시물 수를 입력으로 주었을 때 총 페이지 수를 출력하는 페이징 프로그램을 만들어라.
 *
 * 메소드 이름: getTotalPage
 * 입력 받는 값: 게시물의 총 건수(m), 한 페이지에 보여줄 게시물 수(n)
 * 출력하는 값: 총 페이지수
 */

public class Sample {
    static int getTotalPage(int m, int n) {
        int total;
        if (m % n != 0) {
            total = m/n + 1;
        } else {
            total = m/n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getTotalPage(5, 10));
        System.out.println(getTotalPage(15, 10));
        System.out.println(getTotalPage(25, 10));
        System.out.println(getTotalPage(30, 10));
        System.out.println(getTotalPage(30, 5));
    }
}
