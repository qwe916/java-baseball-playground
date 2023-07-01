import baseball.BaseBall;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseBall baseBall = new BaseBall();
        while (true) {
            System.out.print("숫자를 입력해 주세요: ");
            String inputNumbers = scanner.next();
            String result = baseBall.validateNumbers(inputNumbers);
            if (result.equals("3스트라이크")) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                        "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int i = scanner.nextInt();
                if (i == 1) baseBall = new BaseBall();
                else if (i == 2) break;
            } else {
                System.out.println(result);
            }
        }
    }
}
