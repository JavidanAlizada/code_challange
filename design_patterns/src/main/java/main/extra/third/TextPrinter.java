package main.extra.third;

public class TextPrinter extends Printer {
    public TextPrinter(String message) {
        super(message);
    }

    @Override
    public void print() {
        System.out.println(getMessage());
    }
}
