package guru.springframework.didemo.solid.single_responsibility;

public class Printer {
    Text text;

    Printer(Text t) {
        this.text = t;
    }

    void printText() {
    }
}
