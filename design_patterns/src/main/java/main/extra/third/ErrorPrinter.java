package main.extra.third;

public class ErrorPrinter extends Printer {
    public ErrorPrinter(String message) {
        super(message);
    }

    @Override
    public void print() {
        System.out.println(getMessage());
    }
}
