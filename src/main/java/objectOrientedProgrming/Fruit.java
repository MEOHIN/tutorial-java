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

interface Beeper {
    void beep();
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

    public void beep() {
        System.out.println("삐-");
    }
}

class Banana extends Fruit implements Tropical{
    public String getFactor() {
        return "sunlight";
    }

    public void beep() {
        System.out.println("삐삐");
    }
}

class Farmer {
    void grow(Tropical tropical) {
        System.out.println("grow " + tropical.getFactor());
    }
}

class Alarm {
    void beepFruit(Beeper fruit) {
        fruit.beep();
    }
}