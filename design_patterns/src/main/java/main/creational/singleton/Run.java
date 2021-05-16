package main.creational.singleton;

public class Run {

    public static void main(String[] args) {
        Thread first = new Thread(new Thread1());
        Thread second = new Thread(new Thread2());
        first.start();
        second.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Log log = Log.getInstance("Log initiated first");
            System.out.println(log.getLogMessage());
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Log log = Log.getInstance("Log initiated second");
            System.out.println(log.getLogMessage());
        }
    }
}