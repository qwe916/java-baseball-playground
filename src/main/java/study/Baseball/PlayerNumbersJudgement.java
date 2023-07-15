package study.Baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerNumbersJudgement {
    public static List<Integer> judgeNumber(String playerNumbers) {
        List<Integer> playerNumbersList = Arrays.stream(playerNumbers.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if(playerNumbersList.size() != 3) {
            throw new IllegalArgumentException("3자리 수가 아닙니다.");
        }

        if(playerNumbersList.stream().anyMatch(number -> number < 1 || number > 9)){
            throw new IllegalArgumentException("1~9 사이의 수가 아닌 값이 들어있습니다.");
        }

        if(playerNumbersList.stream().distinct().count() != 3){
            throw new IllegalArgumentException("중복되는 수가 있습니다.");
        }

        return playerNumbersList;
    }
}
