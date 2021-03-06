package ch7_part6_programingParadigm.test.q3;

class HeavyWork extends Thread {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1 초 대기한다.
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

public class Sample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 5; i++) {
            HeavyWork w = new HeavyWork("w" + i);
            w.start();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
