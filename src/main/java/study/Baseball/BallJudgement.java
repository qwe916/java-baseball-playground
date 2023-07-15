package study.Baseball;

import java.util.ArrayList;
import java.util.List;

public class BallJudgement {
    private final List<Ball> comBalls = new ArrayList<>();

    public BallJudgement(List<Integer> com) {
        for (int i = 0; i < 3; i++) {
            comBalls.add(new Ball(i + 1, com.get(i)));
        }
    }

    public BallStatus judgeBall(Ball player) {
        if (player.equals(comBalls.get(player.getPlace()-1))) {
            return BallStatus.STRIKE;
        }
        if (matchBall(player)) {
            return BallStatus.BALL;
        }

        return BallStatus.NOTHING;
    }

    private boolean matchBall(Ball player) {
        return comBalls.stream().anyMatch(ball -> player.getNumber() == ball.getNumber());
    }
}
