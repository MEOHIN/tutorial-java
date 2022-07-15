package objectOrientedProgrming.test.q3;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd (int num) {
        this.value = num;
        return this.value % 2 == 1;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.isOdd(2));
        System.out.println(cal.isOdd(3));
    }
}
