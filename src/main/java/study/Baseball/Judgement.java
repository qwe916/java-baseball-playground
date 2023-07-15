package study.Baseball;

import java.util.List;

public class Judgement {
    private int strike = 0;

    private int ball = 0;

    public String judge(List<Integer> player, List<Integer> com) {
        judgeBall(player, com);

        String answer = answer();

        strike = 0;

        ball = 0;

        return answer;
    }

    private String answer() {
        if(strike == 0 && ball == 0) return "낫싱";

        if(strike != 0 && ball == 0) return strike + "스트라이크";

        if(strike == 0) return ball + "볼";

        return strike + " 스트라이크 " + ball + " 볼";
    }

    private void judgeBall(List<Integer> player, List<Integer> com) {
        for (int i = 0; i < 3; i++) {
            BallJudgement ballJudgement = new BallJudgement(com);

            BallStatus ballStatus = ballJudgement.judgeBall(new Ball(i + 1, player.get(i)));

            countBallStatus(ballStatus);
        }
    }

    private void countBallStatus(BallStatus ballStatus) {
        if(ballStatus.isStrike()) strike++;

        if(ballStatus.isBall()) ball++;
    }
}
