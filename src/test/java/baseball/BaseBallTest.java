package baseball;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

class BaseBallTest {
    BaseBall baseBall = new BaseBall();

    String number = baseBall.getNumber();

    @Test
    void setNumbers() {
        char[] chars = number.toCharArray();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length ; i++) {
            set.add(chars[i]);
        }

        assertThat(set.size()).isEqualTo(3);
    }

    @Test
    void validateNumbers() {
        assertThat(baseBall.validateNumbers(number)).isEqualTo("3스트라이크");
    }
}