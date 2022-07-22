package ch5_objectOrientedProgrming;

public class Sample {
    public static void main(String[] args) {
        Avocado avocado= new Avocado();
        Banana banana = new Banana();

        Alarm alarm = new Alarm();
        alarm.beepFruit(avocado);
        alarm.beepFruit(banana);
    }
}
