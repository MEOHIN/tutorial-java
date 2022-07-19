package exception;

class HungryException extends Exception {
}

public class Sample {
    public void eatFood(String food) throws HungryException {
        if("full".equals(food)) {
            throw new HungryException();
        }
        System.out.println("You are " + food);
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        try {
            sample.eatFood("hungry");
            sample.eatFood("full");
        } catch (HungryException e) {
            System.out.println("HungryException 발생");
        }
    }
}