package ch7_part6_programingParadigm.functionalInterface;

@FunctionalInterface
interface MyInterface {
    void getMessage(String message);
}

class MyApp {
    MyApp() {
        showMessage(System.out::println);
    }

    void showMessage(MyInterface arg) {
        arg.getMessage("Hello, World!");
    }
}

public class Sample {
    public static void main(String[] args) {
    }
}
