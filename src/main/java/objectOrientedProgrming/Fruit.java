package objectOrientedProgrming;

interface Tropical {
    String getFactor();
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
