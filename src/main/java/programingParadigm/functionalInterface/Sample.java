package programingParadigm.functionalInterface;

interface MyInterface {
    void getMessage(String message);
}

class MyApp {
    MyApp() {
        showMessage(new MyInterface() {
            public void getMessage(String message) {
                System.out.println(message);
            }
        });
    }

    void showMessage(MyInterface arg) {
        arg.getMessage("Hello, World!");
    }
}

public class Sample {
    public static void main(String[] args) {
    }
}
