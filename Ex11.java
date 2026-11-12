class Calculator<T> {

    private T number1;
    private T number2;

    // Constructor
    Calculator(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Display values
    void displayValues() {
        System.out.println("First Value  : " + number1);
        System.out.println("Second Value : " + number2);
    }
}

public class Main {

    public static void main(String[] args) {

        // Integer values
        Calculator<Integer> intCalc = new Calculator<>(10, 20);

        System.out.println("===== INTEGER VALUES =====");
        intCalc.displayValues();

        System.out.println();

        // Double values
        Calculator<Double> doubleCalc = new Calculator<>(10.5, 20.5);

        System.out.println("===== DOUBLE VALUES =====");
        doubleCalc.displayValues();

        System.out.println();

        // Float values
        Calculator<Float> floatCalc = new Calculator<>(5.5f, 8.5f);

        System.out.println("===== FLOAT VALUES =====");
        floatCalc.displayValues();
    }
}
