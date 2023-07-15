package study.Baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NumberGeneratorTest {
    private final static int MAX_NUMBER = 9;

    private final static int MIN_NUMBER = 1;

    private static NumberGenerator numberGenerator;

    @BeforeEach
    void setUp(){
        numberGenerator = new NumberGenerator();
    }

    //1~9 상의 랜덤 사이의 수 생성
    @Test
    void 랜덤_수를_생성한다(){
        int randomNumber = numberGenerator.randomNumberGenerate();

        assertThat(randomNumber).isBetween(MIN_NUMBER, MAX_NUMBER);
    }

    @Test
    void 이미_존재하는_수인지_판별한다(){
        Integer number = numberGenerator.getRandomNumberList().get(1);

        assertThat(numberGenerator.judgeExistNumber(number)).isTrue();
    }

    @Test
    void 중복되지_않는_3자리_랜덤_수를_생성한다(){
        numberGenerator.getRandomNumberList().forEach(
                number -> assertThat(numberGenerator.judgeExistNumber(number)).isTrue()
        );
    }
}
