package core.basesyntax;

public class Ball {
    Colors color;
    int number;

    Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "My color is " + color + " My number is " + number;
    }
}
