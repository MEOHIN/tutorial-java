package programingParadigm.functionalInterface;

interface MyInterface {
    void getMessage(String message);
}

class MyClass implements MyInterface {
    public void getMessage(String message) {
        System.out.println(message);
    }
}

class MyApp {
    MyApp() {
        MyClass mc = new MyClass();
        showMessage(mc);
    }

    void showMessage(MyInterface arg) {
        arg.getMessage("Hello, World!");
    }
}

public class Sample {
    public static void main(String[] args) {
    }
}
