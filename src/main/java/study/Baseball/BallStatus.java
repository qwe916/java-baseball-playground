package study.Baseball;

public enum BallStatus {
    STRIKE, BALL, NOTHING;

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
