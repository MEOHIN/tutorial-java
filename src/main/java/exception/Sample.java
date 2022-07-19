package exception;

class HungryException extends RuntimeException {
}

public class Sample {
    public void eatFood(String food) {
        if("full".equals(food)) {
            throw new HungryException();
        }
        System.out.println("You are " + food);
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.eatFood("hungry");
        sample.eatFood("full");
    }
}