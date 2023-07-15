package study.Baseball;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class BallJudgementTest {
    BallJudgement ballJudgement;

    @BeforeEach
    void setUp() {
        ballJudgement = new BallJudgement(Arrays.asList(1,2,3));
    }

    @Test
    void 낫싱() {
        Ball player = new Ball(1, 5);

        assertThat(ballJudgement.judgeBall(player)).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void 스트라이크() {
        Ball player = new Ball(1, 1);

        assertThat(ballJudgement.judgeBall(player)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 볼() {
        Ball player = new Ball(1, 2);

        assertThat(ballJudgement.judgeBall(player)).isEqualTo(BallStatus.BALL);
    }
}
