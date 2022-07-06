public class OddEven {

    public void determineNum(int n) {
        if (n % 2 == 1) {
            System.out.println("자연수 " + n + "은 홀수입니다.");
        }  else if (n % 2 == 0) {
            System.out.println("자연수 " + n + "은 짝수입니다.");
        }  else {
            System.out.println("자연수가 아닙니다.");
        }
    }

    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        oddEven.determineNum(13);
    }
}
