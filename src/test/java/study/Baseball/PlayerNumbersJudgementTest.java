package study.Baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerNumbersJudgementTest {
    @Test
    void 입력받은_수가_3자리_수인지_검증한다(){
        PlayerNumbersJudgement playerNumbersJudgement = new PlayerNumbersJudgement();

        assertThatThrownBy(() -> playerNumbersJudgement.judgeNumber("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("3자리 수가 아닙니다.");
    }

    @Test
    void 입력받은_각각의_수가_1_9_사이의_수인지_검증한다(){
        PlayerNumbersJudgement playerNumbersJudgement = new PlayerNumbersJudgement();

        assertThatThrownBy(() -> playerNumbersJudgement.judgeNumber("023"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1~9 사이의 수가 아닌 값이 들어있습니다.");
    }

    @Test
    void 중복되는_수가_있는지_검증한다(){
        PlayerNumbersJudgement playerNumbersJudgement = new PlayerNumbersJudgement();

        assertThatThrownBy(() -> playerNumbersJudgement.judgeNumber("112"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복되는 수가 있습니다.");
    }
}
