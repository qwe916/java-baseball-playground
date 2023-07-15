package study.Baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class JudgementTest {
    Judgement judgement;
    @BeforeEach
    void setUp(){
        judgement = new Judgement();
    }

    @Test
    void 쓰리_스트라이크(){
        assertThat(judgement.judge(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3))).isEqualTo("3스트라이크");
    }

    @Test
    void 스트라이크_앤_볼(){
        assertThat(judgement.judge(Arrays.asList(1, 4, 3), Arrays.asList(1, 3, 2))).isEqualTo("1 스트라이크 1 볼");
    }

    @Test
    void 온리_볼(){
        assertThat(judgement.judge(Arrays.asList(1, 4, 3), Arrays.asList(4, 3, 2))).isEqualTo("2볼");
    }

    @Test
    void 낫싱(){
        assertThat(judgement.judge(Arrays.asList(1, 4, 3), Arrays.asList(5, 6, 7))).isEqualTo("낫싱");
    }
}
