package ch5_objectOrientedProgrming.test.q7;

interface Mineral {
    int getScore();
}

class Gold implements Mineral {
    public int getScore() {
        return 100;
    }
}

class Silver implements Mineral {
    public int getScore() {
        return 90;
    }
}

class Bronze implements Mineral {
    public int getScore() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += mineral.getScore();
    }

    public int getValue() {
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
    }
}