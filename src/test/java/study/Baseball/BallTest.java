package study.Baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallTest {
    @Test
    void 두_볼이_같은_볼인지_확인한다(){
        Ball player = new Ball(1, 2);
        
        Ball com = new Ball(1, 2);

        Assertions.assertThat(player.equals(com)).isTrue();
    }
}
