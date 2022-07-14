package objectOrientedProgrming;

interface Tropical {
    String getFactor();

    default void printFactor() {
        System.out.println("my growth factor is %s\n", getFactor());
    }

    int FLOWER_COUNT = 5;    // 인터페이스 상수

    static int harvest() {
        return FLOWER_COUNT * 30;
    }
}

class Fruit {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Avocado extends Fruit implements Tropical {
    public String getFactor() {
        return "water";
    }
}

class Banana extends Fruit implements Tropical{
    public String getFactor() {
        return "sunlight";
    }
}

class Farmer {
    void grow(Tropical tropical) {
        System.out.println("grow " + tropical.getFactor());
    }
}

class Alarm {
    void beep(Fruit fruit) {
        if (fruit instanceof Avocado) {    // instanceOf 는 어떤 객체가 특정 클래스의 객체인지 확인하는 자바 내장 명령어
            System.out.println("삐-");
        } else if (fruit instanceof Banana) {
            System.out.println("삐삐");
        }
    }
}