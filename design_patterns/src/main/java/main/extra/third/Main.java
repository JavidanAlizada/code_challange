package main.extra.third;

public class Main {

    public static void main(String[] args) {
        Printer[] printer = {new TextPrinter("It is text"), new ErrorPrinter("It is error")};
        for (Printer eachPrint : printer) {
            eachPrint.print();
        }
    }
}
