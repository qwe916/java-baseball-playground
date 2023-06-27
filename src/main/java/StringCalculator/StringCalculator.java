package StringCalculator;

public class StringCalculator {
    public int calculateAll(String[] values) {
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length - 1; i+=2) {
            result = calculate(values[i],result, Integer.parseInt(values[i + 1]));
        }

        return result;
    }

    public int calculate(String operation, int a, int b) {
        switch (operation){
            case "+" :
                return plus(a, b);
            case "-":
                return minus(a, b);
            case "*":
                return multi(a, b);
            case "/":
                return div(a, b);
        }

        throw new RuntimeException("잘못된 수식입니다.");
    }
    public int  plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
