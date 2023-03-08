package godOfJava;

public class Calculator3 {
    public static void main(String[] args) {
        System.out.println("Calculator class stared");
        Calculator3 calc = new Calculator3();
        int a = 10;
        int b = 5;
        System.out.println("add=" + calc.add(a, b));
        System.out.println("subtract=" + calc.subtract(a, b));
        System.out.println("multiply=" + calc.multiply(a, b));
        System.out.println("divide=" + calc.divide(a, b));
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
