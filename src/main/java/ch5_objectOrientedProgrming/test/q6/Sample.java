package ch5_objectOrientedProgrming.test.q6;

class Calculator {
    // Integer 자료형은 값을 대입하지 않을 경우에 null 이다.
    Integer value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}