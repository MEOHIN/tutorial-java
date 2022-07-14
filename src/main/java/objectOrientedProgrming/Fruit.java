package objectOrientedProgrming;

abstract class Tropical extends Fruit {
    abstract String getFactor();

    void printFactor() {
        System.out.printf("my growth factor is %s\n", getFactor());
    }

    static int FLOWER_COUNT = 5;

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

class Avocado extends Tropical implements Beeper {
    public String getFactor() {
        return "water";
    }

    public void beep() {
        System.out.println("삐-");
    }
}

class Banana extends Tropical implements Beeper{
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