package study.Baseball;


public class Ball {
    private final int place;

    private final int number;

    public Ball(int place, int number) {
        this.place = place;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        Ball ball = (Ball) obj;

        if(this.place == ball.place && this.number == ball.number) return true;

        return false;
    }

    public int getPlace() {
        return place;
    }

    public int getNumber() {
        return number;
    }
}
