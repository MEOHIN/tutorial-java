package thread;

public class Sample extends Thread {
    int order;

    public Sample(int order) {    // 클래스명과 동일한 이름의 메소드는 생성자다: 객체 변수에 값을 생성하도록 강제
        this.order = order;
    }

    public void run() {
        System.out.println(this.order + " Thread start");    // thread 시작
        try {
            Thread.sleep(1000);    // 1초 대기
        } catch (Exception e) {}
        System.out.println(this.order + " thread run");    // thread 종료
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {    // 10개의 thread 를 생성하고 실행
            Thread t = new Sample(i);
            t.start();
        }
        System.out.println("main end");    // main 메서드 종료
    }
}
