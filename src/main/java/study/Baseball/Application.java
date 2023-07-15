package study.Baseball;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;

        NumberGenerator numberGenerator;

        Judgement judgement = new Judgement();

        while (start == 1) {

            numberGenerator = new NumberGenerator();

            while (true){
                try {
                    System.out.print("숫자를 입력해 주세요 : ");

                    String playerInput = scanner.next();

                    List<Integer> player = PlayerNumbersJudgement.judgeNumber(playerInput);

                    String judge = judgement.judge(player, numberGenerator.getRandomNumberList());

                    System.out.println(judge);

                    if (judge.equals("3스트라이크")) {
                        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

                        start = scanner.nextInt();

                        break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
