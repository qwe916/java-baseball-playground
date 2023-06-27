package StringCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void calculateAll() {
        String[] values = "2 + 3 * 4 / 2".split(" ");
        assertThat(stringCalculator.calculateAll(values)).isEqualTo(10);
    }

    @ParameterizedTest
    @CsvSource(value = {"+:2", "-:0", "*:1", "/:1"}, delimiter = ':')
    void calculate(String operation, int result) {
        assertThat(stringCalculator.calculate(operation, 1, 1)).isEqualTo(result);
    }

    @Test
    void plus() {
        assertThat(stringCalculator.plus(1, 1)).isEqualTo(2);
    }

    @Test
    void minus() {
        assertThat(stringCalculator.minus(1, 1)).isEqualTo(0);
    }

    @Test
    void multi() {
        assertThat(stringCalculator.multi(1, 1)).isEqualTo(1);
    }

    @Test
    void div() {
        assertThat(stringCalculator.div(1, 1)).isEqualTo(1);
    }

    @Test
    void calculate_Error(){
        assertThatThrownBy(() -> stringCalculator.calculate("2", 1, 1)).isInstanceOf(RuntimeException.class);
    }
}