package objectOrientedProgrming;

class Fruit {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Apple extends Fruit {
    void ripe() {
        System.out.println(this.name+" yum");
    }
}

class HomegrownApple extends Apple {
    HomegrownApple(String name) {
        this.setName(name);
    }

    HomegrownApple(int type) {
        if (type == 1) {
            this.setName("envy");
        } else if (type == 2) {
            this.setName("fuji");
        }
    }

    void ripe() {
        System.out.println(this.name+" yum in my yard");
    }

    void ripe(String when) {    // 기존 ripe() 메서드와 이름은 동일하지만, 입력항목이 다르다.
        System.out.println(this.name+" yum in my yard" + when);
    }
}
