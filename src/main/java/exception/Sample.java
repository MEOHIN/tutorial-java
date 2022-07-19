package exception;

class HungryException extends Exception {
}

public class Sample {
    public void eatFood(String food) {
        try {
            if("full".equals(food)) {
                throw new HungryException();
            }
            System.out.println("You are " + food);
        } catch (HungryException e) {
            System.out.println("HungryException 발생");
        }
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.eatFood("hungry");
        sample.eatFood("full");
    }
}