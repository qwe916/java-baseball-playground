import StringCalculator.StringCalculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args)   {
        StringCalculator stringCalculator = new StringCalculator();

        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        String[] values = value.split(" ");

        int result = stringCalculator.calculateAll(values);

        System.out.println(result);
    }
}
