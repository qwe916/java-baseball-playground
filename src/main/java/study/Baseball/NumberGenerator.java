package study.Baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {
    List<Integer> randomNumberList = new ArrayList<>();
    public int randomNumberGenerate() {
        Random random = new Random();

        int randomNumber = random.nextInt(9) + 1;

        return randomNumber;
    }

    public boolean judgeExistNumber(int randomNumber) {
        return randomNumberList.contains(randomNumber);
    }

    public NumberGenerator() {
        while (randomNumberList.size() < 3) {
            int randomNumber = randomNumberGenerate();

            if (judgeExistNumber(randomNumber)) {
                continue;
            }

            randomNumberList.add(randomNumber);
        }
    }

    public List<Integer> getRandomNumberList() {
        return randomNumberList;
    }
}
