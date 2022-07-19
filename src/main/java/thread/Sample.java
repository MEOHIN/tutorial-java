package thread;

public class Sample extends Thread {
    public void run() {
        System.out.println("Thread run");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start();
    }
}
