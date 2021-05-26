package se.thread;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        counter.count = 0;
        Producer directly = new Producer(counter);
        directly.start();
        Consumer fromRunnable = new Consumer(counter);
        Thread fromRunnableThread = new Thread(fromRunnable);
        directly.join();
        fromRunnableThread.start();
        fromRunnableThread.join();

//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000);
//            System.out.println(i);
//            if (Thread.interrupted())
//                System.err.println("It is interrupted");
//        }
    }

}

class Producer extends Thread {
    Counter counter;

    public Producer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.count++;
            System.out.println("From producer: " + counter.count);
        }

    }
}

class Consumer implements Runnable {
    Counter counter;

    public Consumer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.count--;
            System.out.println("From consumer: " + counter.count);
        }
    }
}



class Counter {
    int count;
}