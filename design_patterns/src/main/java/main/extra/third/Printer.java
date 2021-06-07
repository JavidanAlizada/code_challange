package main.extra.third;

public abstract class Printer implements Printable {
    private String message;

    public Printer(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
