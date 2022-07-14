package objectOrientedProgrming;

public class Sample {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setName("pip");

        Fruit banana = new Fruit();
        banana.setName("pulp");

        System.out.println(apple.name);    // pip 출력
        System.out.println(banana.name);    // pulp 출력
    }
}
