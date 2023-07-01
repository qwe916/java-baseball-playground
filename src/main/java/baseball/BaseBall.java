package baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BaseBall {
    private String number = "";

    private final Set<String> numberSet = new HashSet<>();

    private int strike;

    private int ball;

    public BaseBall() {
        number += setNumbers();
    }

    public String setNumbers() {
        String tempNumber = "";

        while (tempNumber.length() != 3) {
            String randomNumber = setNumber();

            tempNumber += randomNumber;
        }

        return tempNumber;
    }

    public String setNumber() {
        Random random = new Random();

        String randomNumber = String.valueOf(random.nextInt(9)+1);

        if (!numberSet.contains(randomNumber)) {
            numberSet.add(randomNumber);

            return randomNumber;
        }

        return "";
    }

    public String validateNumbers(String inputNumbers) {
        strike = 0;

        ball = 0;

        for (int i = 0; i < inputNumbers.length(); i++) {
            char inputNumberOfIndex = inputNumbers.charAt(i);

            validateNumber(i, inputNumberOfIndex);
        }

        return strikeAndBall();
    }

    public void validateNumber(int index, char inputNumberOfIndex) {
        if(number.charAt(index) == inputNumberOfIndex) strike++;
        else if(numberSet.contains(String.valueOf(inputNumberOfIndex))) ball++;
    }

    public String strikeAndBall() {
        if (strike == 0 && ball == 0) {
            return "낫싱";
        } else if (strike == 0 && ball != 0) {
            return ball + "볼";
        } else if (strike != 0 && ball == 0) {
            return strike + "스트라이크";
        } else if (strike != 0 && ball != 0) {
            return ball + "볼 " + strike + "스트라이크";
        }
        return "";
    }

    public String getNumber() {
        return number;
    }
}
