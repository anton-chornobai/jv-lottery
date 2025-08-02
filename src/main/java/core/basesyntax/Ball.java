package core.basesyntax;

public class Ball {
    private Colors color;
    private int number;

    int getNumber() {
        return this.number;
    }

    void setNumber(int num) {
        this.number = num;
    }

    Colors getColor() {
        return this.color;
    }

    void setColor(Colors color) {
        this.color = color;
    }


    Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "My color is " + color + " My number is " + number;
    }
}
